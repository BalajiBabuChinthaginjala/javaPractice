package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleExecutor {
    //main() method start
    public static void main(String[] args) {
        //creating an object of ExecutorService with fixed thread pool 5
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int j = 0; j < 5; j++) {
            //creating instance of the Task1 class and pass a value to its constructor
            Runnable task = new Task1("" + j);

            executorService.execute(task);
        }
        //closing executor
        executorService.shutdown();

        while (!executorService.isTerminated()) {
        }
        System.out.println("Finished all threads");
    }
}
