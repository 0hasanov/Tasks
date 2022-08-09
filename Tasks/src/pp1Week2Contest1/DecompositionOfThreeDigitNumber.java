package pp1Week2Contest1;
import java.util.Scanner;
public class DecompositionOfThreeDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int hundreds = n / 100 % 10;
        int tens = n / 10 % 10;
        int ones = n % 10;

        System.out.println(hundreds);
        System.out.println(tens);
        System.out.println(ones);


    }
}
