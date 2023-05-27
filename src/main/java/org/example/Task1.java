package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task1 implements Runnable {

    //initialize threadNo variable
    private String threadNo;

    //using constructor to set value to the threadNo variable
    public Task1(String no){
        this.threadNo = no;
    }

    //using run() method by overriding it
    @Override
    public void run() {
        //printing thread information
        System.out.println(Thread.currentThread().getName()+" start execution. Thread No = "+threadNo);

        //calling processThread() method for processing thread
        processThread();

        //printing a statement to show the end of the thread
        System.out.println(Thread.currentThread().getName()+" stop execution.");
    }

    //creating processThread() method to execute thread
    private void processThread() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //overriding toString() method
    @Override
    public String toString(){
        return this.threadNo;
    }
}