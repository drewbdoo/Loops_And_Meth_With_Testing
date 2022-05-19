import java.util.Scanner;

public class DivideAndConquerMeth {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        divide(1, 3);

    }

    public static void divide(int num, int num2) {
        double n1 = num;
        double n2 = num2;
        System.out.println(num + " / " + num2 + " = " + (n1/n2));

    }
}
