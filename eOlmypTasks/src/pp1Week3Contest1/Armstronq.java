package pp1Week3Contest1;

import java.util.Scanner;

public class Armstronq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = a; i <= b; i++) {

            if (isArmstrong(i)) {
                System.out.printf("%d ", i);

            }
        }
    }

    private static boolean isArmstrong(int i) {
        int firstdigit = i / 1000;
        int seconddigit = i / 100 % 10;
        int thirddigit = i / 10 % 10;
        int lastdigit = i % 10;

        int tr = (int) ((Math.pow(firstdigit, 4) + Math.pow(seconddigit, 4) + Math.pow(thirddigit, 4) + Math.pow(lastdigit, 4)));
        return i==tr;
    }
    }

