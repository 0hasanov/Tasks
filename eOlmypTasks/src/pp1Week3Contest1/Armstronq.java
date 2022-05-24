package pp1Week3Contest1;

import java.util.Scanner;

public class Armstronq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int firstdigit = a / 1000;
        int seconddigit = a / 100 % 10;
        int thirddigit = a / 10 % 10;
        int lastdigit = a % 10;
        for (int i = a; i <= b; i++) {

            int tr = (int) ((Math.pow(firstdigit, 4) + Math.pow(seconddigit, 4) + Math.pow(thirddigit, 4) + Math.pow(lastdigit, 4)));

            for (int number = 0; number >= tr; number++) {
                if (number == tr) {
                    number = tr;
                }

            }
            System.out.println(tr);

        }

    }
}

