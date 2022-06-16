package pp1AndABitmore;

import java.util.Scanner;

public class AlgorithmicExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.next();
        if (password.length() >= 10 && password.matches("[a-zA-Z0-9]+")) {
            System.out.printf(" %s is a valid password!", password);
        }
        if (password.length() < 10) {
            System.out.printf(" %s is invalid password!" + "\n" + " Password length is small.It must be minimum ten characters!", password);
        }
        if (!password.matches("[a-zA-Z0-9]+")) {
            System.out.printf(" %s is invalid password!" + "\n" + "A password don't consist of only letters and digits!", password);
        }
    }

}
