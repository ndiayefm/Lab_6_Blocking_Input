import java.util.Scanner;



public class RectangleInfo {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);



        double width = 0;

        double height = 0;

        String trash = "";



        // 1. Loop for width

        boolean doneWidth = false;

        do {

            System.out.print("Enter the width of the rectangle: ");

            if (in.hasNextDouble()) {

                width = in.nextDouble();

                in.nextLine(); // Clear buffer

                if (width > 0) {

                    doneWidth = true;

                } else {

                    System.out.println("Width must be greater than 0. Try again.");

                }

            } else {

                trash = in.nextLine();

                System.out.println("Invalid input: " + trash + ". Please enter a valid number.");

            }

        } while (!doneWidth);



        // 2. Loop for height

        boolean doneHeight = false;

        do {

            System.out.print("Enter the height of the rectangle: ");

            if (in.hasNextDouble()) {

                height = in.nextDouble();

                in.nextLine(); // Clear buffer

                if (height > 0) {

                    doneHeight = true;

                } else {

                    System.out.println("Height must be greater than 0. Try again.");

                }

            } else {

                trash = in.nextLine();

                System.out.println("Invalid input: " + trash + ". Please enter a valid number.");

            }

        } while (!doneHeight);



        // Calculations

        double area = width * height;

        double perimeter = 2 * (width + height);

        double diagonal = Math.sqrt((width * width) + (height * height));



        // Output Results

        System.out.println("\nRectangle Details:");

        System.out.println("Area: " + area);

        System.out.println("Perimeter: " + perimeter);

        System.out.println("Length of the diagonal: " + diagonal);

    }

}