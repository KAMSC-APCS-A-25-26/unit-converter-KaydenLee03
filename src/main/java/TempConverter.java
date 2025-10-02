import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("1. Convert Fahrenheit to Celsius");
            System.out.println("2. Convert Celsius to Fahrenheit");
            System.out.println("3. Exit");
            System.out.print("Choose your option: ");
            int userChoice = scan.nextInt();

            switch (userChoice) {
                case 1:
                    System.out.print("Enter F value: ");
                    double fVal = scan.nextDouble();

                    System.out.println("Fahrenheit Value: " + fVal);
                    System.out.println("Celsius Value: " + (fVal - 32) * 5 / 9);
                    break;

                case 2:
                    System.out.print("Enter C value: ");
                    double cVal = scan.nextDouble();

                    System.out.println("Celsius Value: " + cVal);
                    System.out.println("Fahrenheit Value: " + cVal * 9 / 5 + 32);
                    break;

                case 3:
                    System.out.println("Bye");
                    isRunning = false;
                    break;

                default:
                    System.out.println("ERROR: INVALID OPTION");
            }
        }

        // Requirements:
        // - Menu with options: 1. Convert Fahrenheit to Celsius, 2. Convert Celsius to Fahrenheit, 3. Exit
        // - Loop until user chooses to exit
        // - Use formulas: C = (F - 32) * 5/9 and F = C * 9/5 + 32
        // - Display conversion results
        // - Handle invalid menu choices
    }
}