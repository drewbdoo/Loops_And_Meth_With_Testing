import java.util.Scanner;

public class StopAtFivePachapa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean loopVar = true;

        do{
            System.out.println("Gvie a number?");
            double reply = scanner.nextDouble();
            if(reply==5){
                loopVar = false;
                System.exit(0);
            }
        } while(loopVar);
        scanner.close();
    };

}
