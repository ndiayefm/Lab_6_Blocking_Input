import java.util.Scanner;



public class FuelCosts {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);



        double gallons = 0;

        double efficiency = 0;

        double price = 0;

        String trash = "";



        // 1. Loop for gallons in tank

        boolean doneGallons = false;

        do {

            System.out.print("Enter the number of gallons of gas in the tank: ");

            if (in.hasNextDouble()) {

                gallons = in.nextDouble();

                in.nextLine(); // Clear buffer

                if (gallons >= 0) {

                    doneGallons = true;

                } else {

                    System.out.println("Gallons cannot be negative. Try again.");

                }

            } else {

                trash = in.nextLine();

                System.out.println("Invalid input: " + trash + ". Please enter a valid number.");

            }

        } while (!doneGallons);



        // 2. Loop for fuel efficiency (mpg)

        boolean doneEfficiency = false;

        do {

            System.out.print("Enter the fuel efficiency (miles per gallon): ");

            if (in.hasNextDouble()) {

                efficiency = in.nextDouble();

                in.nextLine(); // Clear buffer

                if (efficiency > 0) {

                    doneEfficiency = true;

                } else {

                    System.out.println("Efficiency must be greater than 0. Try again.");

                }

            } else {

                trash = in.nextLine();

                System.out.println("Invalid input: " + trash + ". Please enter a valid number.");

            }

        } while (!doneEfficiency);



        // 3. Loop for price per gallon

        boolean donePrice = false;

        do {

            System.out.print("Enter the price of gas per gallon: ");

            if (in.hasNextDouble()) {

                price = in.nextDouble();

                in.nextLine(); // Clear buffer

                if (price >= 0) {

                    donePrice = true;

                } else {

                    System.out.println("Price cannot be negative. Try again.");

                }

            } else {

                trash = in.nextLine();

                System.out.println("Invalid input: " + trash + ". Please enter a valid number.");

            }

        } while (!donePrice);



        // Calculations

        double costPer100Miles = (100.0 / efficiency) * price;

        double distanceWithFullTank = gallons * efficiency;



        // Output Results

        System.out.printf("\nThe cost to drive 100 miles is: $%.2f\n", costPer100Miles);

        System.out.printf("The car can go a distance of %.2f miles with a full tank.\n", distanceWithFullTank);

    }

}