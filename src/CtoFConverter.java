import java.util.Scanner;



public class CtoFConverter {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);



        double celsius = 0;

        double fahrenheit = 0;

        String trash = ""; // Used for bad input which will read as a String

        boolean done = false;



        // Loop to bulletproof the input

        do {

            System.out.print("Enter temperature in Celsius: ");



            if (in.hasNextDouble()) {

                celsius = in.nextDouble();

                in.nextLine(); // Clear the newline from the buffer

                done = true;   // Valid number received, break out of loop

            } else {

                // Not a double, read as string to clear the buffer

                trash = in.nextLine();

                System.out.println("\nYou entered invalid input: " + trash);

                System.out.println("You have to enter a valid numeric temperature!");

            }

        } while (!done);



        // Perform the temperature conversion calculation

        fahrenheit = (celsius * 9 / 5) + 32;



        // Display the results

        System.out.println("The equivalent temperature in Fahrenheit is: " + fahrenheit);

    }

}