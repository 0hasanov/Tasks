package pp1Week2Contest1;

import java.util.Scanner;


public class ConditionalStatement2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>=10) {
            System.out.println(Math.pow(a,3) + a*5);
        }
        else if (a<10) {
            System.out.println(Math.pow(a,2) -a*2 + 4);
        }
    }
}
