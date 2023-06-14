package kiku;

public class ShowHighlight {
    public static void main(String[] args) {
        ShowHighlight showHighlight = new ShowHighlight();
        System.out.println(showHighlight.highLightKeyword("balaji Goutham balaji prasanth balaji", "balaji"));
    }

    public String highLightKeyword(String input, String query) {
        while (true) {
            if (input.contains(query)) {
                int startIndex = input.indexOf(query);
                int endIndex = input.indexOf(startIndex + query.length());
                String stringBefore = input.substring(0, startIndex);
                String stringAfter = input.substring(endIndex + 1);
                input = stringBefore + "<span style=\"background-color:red;\">" + query + "</span>" + stringAfter;
            } else {
                System.out.println("not fond");
                break;
            }
        }
        return input;
    }

}
