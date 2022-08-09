package pp1Week2Contest1;
import java.util.Scanner;
public class PositiveNegativeOrZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a>0){
            System.out.println("Positive");
        }
        else if (a==0){
            System.out.println("Zero");

        }
        else {
            System.out.println("Negative");
        }
    }
}
