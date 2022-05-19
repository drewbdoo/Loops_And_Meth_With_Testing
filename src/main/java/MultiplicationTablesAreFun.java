import java.util.Scanner;

public class MultiplicationTablesAreFun {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number: ");
        int num = scanner.nextInt();
        for(int var = 1; var<=10; var++){
            System.out.println(num + " x " + var + " = " + (num*var));
        };
    }

}
