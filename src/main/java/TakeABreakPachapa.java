import java.util.Scanner;
public class TakeABreakPachapa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean loopVar = true;

        do{
            System.out.println("Do you want to take a break?");
            String reply = scanner.nextLine();
            if(reply.equalsIgnoreCase("yes")){
                loopVar = false;
                System.exit(0);
            }
        } while(loopVar);
        scanner.close();
    }
}