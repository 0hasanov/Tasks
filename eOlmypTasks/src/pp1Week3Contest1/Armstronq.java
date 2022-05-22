package pp1Week3Contest1;

import java.util.Scanner;

public class Armstronq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        int firstdigit = a / 1000;
        int seconddigit = a / 100 % 10;
        int thirddigit = a / 10 % 10;
        int lastdigit = a % 10;
        for (int i = 1000; i <= arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int tr = (int) ((Math.pow(firstdigit, 4) + Math.pow(seconddigit, 4) + Math.pow(thirddigit, 4) + Math.pow(lastdigit, 4)));
        for (int number : arr) {
            if (number == tr) {
                number = tr;
            }

        }
        System.out.println(Math.pow(firstdigit, 4) + Math.pow(seconddigit, 4) + Math.pow(thirddigit, 4) + Math.pow(lastdigit, 4));

    }

}
