import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("1. Convert Miles to Kilometers");
            System.out.println("2. Convert Convert Kilometers to Miles");
            System.out.println("3. Exit");
            System.out.print("Choose your option: ");
            int userChoice = scan.nextInt();

            switch (userChoice) {
                case 1:
                    System.out.print("Enter miles value: ");
                    double mVal = scan.nextDouble();

                    System.out.println("Miles Value: " + mVal);
                    System.out.println("Kilometers Value: " + mVal*1.60935);
                    break;

                case 2:
                    System.out.print("Enter Kilometers value: ");
                    double kVal = scan.nextDouble();

                    System.out.println("Kilometers Value: " + kVal);
                    System.out.println("Miles Value: " + kVal/1.60935);
                    break;

                case 3:
                    System.out.println("Bye");
                    isRunning = false;
                    break;

                default:
                    System.out.println("ERROR: INVALID OPTION");
            }

            // Requirements:
            // - Menu with options: 1. Convert Miles to Kilometers, 2. Convert Kilometers to Miles, 3. Exit
            // - Loop until user chooses to exit
            // - Use conversion factor: 1 mile = 1.60935 kilometers
            // - Display conversion results
            // - Handle invalid menu choices
        }
    }
}