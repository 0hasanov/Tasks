package Tasks.PP1Week2Contest1;
import java.util.Scanner;
public class Divisibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a % b == 0) {
            System.out.println("divisible");
        }
        else {
            System.out.println(a / b + " " + a % b);
        }
    }
}
