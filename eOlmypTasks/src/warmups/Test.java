package warmups;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number = sc.nextDouble();

        double dc = Math.floor(number);
        if (number == dc) {
            System.out.println("Ok");
        }
        else{
            System.out.println("No");
        }



    }
}