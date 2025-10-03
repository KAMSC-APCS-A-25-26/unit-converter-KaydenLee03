import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("1. Convert Fahrenheit to Celsius");
            System.out.println("2. Convert Celsius to Fahrenheit");
            System.out.println("3. Exit");
            System.out.print("Please enter 1, 2, or 3: ");
            int userChoice = scan.nextInt();

            switch (userChoice) {
                case 1:
                    System.out.print("Enter F value: ");
                    double fVal = scan.nextDouble();

                    System.out.println("Fahrenheit: " + fVal);
                    System.out.println("Celsius: " + ((fVal - 32) * (5.0/9.0)));
                    break;

                case 2:
                    System.out.print("Enter C value: ");
                    double cVal = scan.nextDouble();

                    System.out.println("Celsius: " + cVal);
                    System.out.println("Fahrenheit: " + ((cVal * (9.0/5.0)) + 32));
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