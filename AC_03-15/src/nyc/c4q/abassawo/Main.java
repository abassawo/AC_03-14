




package nyc.c4q.abassawo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        String mesQ = "pineapple in your mother's basement";
        String correctResponse;
        char fromLetter = 'e';
        String response;
        char toLetter = 'o';
        boolean correct = true;
        System.out.println("" +
                mesQ.replace(fromLetter, toLetter));
        System.out.println("Is this spelled correctly?");
        response = userInput.nextLine();

        //FIXME
        while(response.equalsIgnoreCase("no")){
            System.out.println("Show me how to spell it");
             correctResponse = userInput.nextLine() ;
            System.out.println(correctResponse);
        }

        if (!(correct)) {
            System.out.println("How should I spell it?");
        }


        fromLetter = 'e';
        toLetter = 'o';
        mesQ = "The Ides of March";
        System.out.println(mesQ.replace(fromLetter, toLetter));
        System.out.println("The ides of March is " + mesQ);
    }
}
