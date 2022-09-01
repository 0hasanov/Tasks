package hackerRank;
import java.util.Scanner;
public class DataTypes {
    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            try {
                long x = sc.nextLong();
                if (x > -Math.pow(2, 7) && x < Math.pow(2, 7)) {
                    System.out.printf("%s can be fitted in: \n* byte\n* short\n* int\n* long\n", x);
                } else if (x > -Math.pow(2, 15) && x < Math.pow(2, 15)) {
                    System.out.printf(
                            "%s can be fitted in: \n* short\n* int\n* long\n", x);
                } else if (x > -Math.pow(2, 31) && x < Math.pow(2, 31)) {
                    System.out.printf(
                            "%s can be fitted in: \n* int\n* long\n", x);
                } else if (x > -Math.pow(2, 63) && x < Math.pow(2, 63)) {
                    System.out.printf(
                            "%s can be fitted in: \n* long\n", x);
                } else {
                    System.out.printf("%s can't be fitted anywhere.", x);
                }
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
    }
}