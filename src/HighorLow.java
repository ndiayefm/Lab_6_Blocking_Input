

import java.util.Scanner;

import java.util.Random;



public class HighorLow {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Random generator = new Random();



        // Generate random int value between 1 and 10 inclusive

        int targetValue = generator.nextInt(10) + 1;

        int userGuess = 0;

        String trash = "";

        boolean done = false;



        // Loop to bulletproof the guess input (must be an int from 1 to 10)

        do {

            System.out.print("Guess a number between 1 and 10 inclusive: ");

            if (in.hasNextInt()) {

                userGuess = in.nextInt();

                in.nextLine(); // Clear buffer



                if (userGuess >= 1 && userGuess <= 10) {

                    done = true; // Valid guess in the correct range

                } else {

                    System.out.println("Your guess is out of range! It must be between 1 and 10.");

                }

            } else {

                trash = in.nextLine();

                System.out.println("Invalid input: " + trash + ". Please enter a valid integer.");

            }

        } while (!done);



        // Display the computer's secret number

        System.out.println("The secret random number was: " + targetValue);



        // Check if the guess was high, low, or correct

        if (userGuess == targetValue) {

            System.out.println("Your guess was right on the money!");

        } else if (userGuess > targetValue) {

            System.out.println("Your guess was too high!");

        } else {

            System.out.println("Your guess was too low!");

        }

    }

}