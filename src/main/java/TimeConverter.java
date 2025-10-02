import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Convert time to total seconds");

            System.out.print("Enter hours: ");
            int hVal = scan.nextInt();
            System.out.print("Enter minutes: ");
            int mVal = scan.nextInt();
            System.out.print("Enter seconds: ");
            int sVal = scan.nextInt();

            System.out.println("Input: " + hVal + " hour, " + mVal + " minute, and " + sVal + " second");
            System.out.println("Total seconds: " + hVal * 3600 + mVal * 60 + sVal);

            System.out.println("Calculation:");
            System.out.println(hVal + " hours x 3600 = " + hVal*3600 + " hours");
            System.out.println(mVal + " minutes x 60 = " + mVal*60 + " minutes");
            System.out.println(sVal + " seconds = " + sVal + " seconds");

            System.out.print("Convert another time? (y/n): ");
            String continueChoice = scan.next();

            if (continueChoice.equals("n")) {
                System.out.println("Goodbye!");
                isRunning = false;
            }
        }

        // Requirements:
        // - Prompt for hours, minutes, and seconds
        // - Display conversion results and calculation breakdown
        // - Ask user if they want to convert another time (y/n)
        // - Loop until user chooses to exit
    }
}