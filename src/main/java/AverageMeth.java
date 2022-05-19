public class AverageMeth {
    public static void main(String[] args) {
        System.out.println("The average is: " + average(2, 5, 8));

    }

    public static double sum(double num, double num2, double num3) {
        return  (num+num2+num3);

    }

    public static double average(double num, double num2, double num3) {
        return  (sum(num, num2, num3))/3;

    }
}
