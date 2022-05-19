import java.util.Scanner;

public class PersonalizedPositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Boolean loopVar = true;
        System.out.println("Which TA is grading this?");
        String taName = scanner.nextLine();
        do {
            System.out.println(taName + ", please, enter a number:");
            int reply = scanner.nextInt();
            if (reply == 0) {
                loopVar = false;
                System.exit(0);
            } else if (reply < 0) {
                System.out.println("Number must be a positive number, " + taName + ". You should know this.");
            } else {
                System.out.println("Number is " + reply);
            }
        } while (loopVar);
        scanner.close();

    }

}
