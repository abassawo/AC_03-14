package nyc.c4q.abassawo;

import java.util.Scanner;
public class exitTicket {
    public static void main(String[] args) {
        Scanner inPut = new Scanner(System.in);


        for (int i = 0; i < 5; i++) {
            int userGuess = 0;
            System.out.println("You have 5 turns to guess a number between 1 - 20");
            userGuess = inPut.nextInt();
            if (userGuess == 10) {
                System.out.println("You guessed it!");
                return;
            } else if (userGuess >= 1 && userGuess<= 9)  {
                System.out.println("Your guess is too low;");
            }
            else if (userGuess >= 11 && userGuess <= 20) {
                System.out.println("Your guess is too high");
            }
            else {
                System.out.println("Please guess a number between 1 and 20!");
            }



        }
        System.out.println("Sorry, your 5 turns are up!");



    }
}
