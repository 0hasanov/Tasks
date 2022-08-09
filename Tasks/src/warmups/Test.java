package warmups;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number = sc.nextDouble();

        double dc = Math.floor(number);
        if (number == dc) {
            System.out.println("Ok");
        } else {
            try {

                throw new Exception("tam eded deyil", new Throwable());

            } catch (ArithmeticException e) {
                e.printStackTrace();
            } catch (NullPointerException n) {
                n.printStackTrace();
            } catch (Exception n) {
                System.out.println(n.getMessage());
            }
            System.out.println("No");
        }

    }


}