import java.util.Scanner;

public class Exponent {

    static int result = 1;

    public static void main(String[] args) {
        Scanner dat = new Scanner(System.in);
        System.out.println("enter number= ");
        int num = dat.nextInt();
        System.out.println("enter power= ");
        int power = dat.nextInt();

        System.out.println("expo() = " + expo(num, power));
    }

    static long expo(int num, int power) {

          if (power == 0)
            return 1;
            result *= num;
        expo(num, power - 1);
        return result;
    }
}
