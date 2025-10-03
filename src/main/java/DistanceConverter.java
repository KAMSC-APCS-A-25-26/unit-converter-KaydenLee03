import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Choose conversion direction");
            System.out.println("1. Convert Miles to Kilometers");
            System.out.println("2. Convert Kilometers to Miles");
            System.out.println("3. Exit");
            System.out.print("Please enter 1, 2, or 3");
            int userChoice = scan.nextInt();

            switch (userChoice) {
                case 1:
                    System.out.print("Enter distance in miles");
                    double mVal = scan.nextDouble();

                    System.out.println("Miles: " + mVal);
                    System.out.println("Kilometers: " + mVal*1.60935);
                    break;

                case 2:
                    System.out.print("Enter distance in kilometers");
                    double kVal = scan.nextDouble();

                    System.out.println("Kilometers: " + kVal);
                    System.out.println("Miles: " + kVal/1.60935);
                    break;

                case 3:
                    System.out.println("Goodbye!");
                    isRunning = false;
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}