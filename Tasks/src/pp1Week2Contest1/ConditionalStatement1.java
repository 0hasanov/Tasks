package pp1Week2Contest1;

import java.util.Scanner;

public class ConditionalStatement1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();

        if (a<5)
        {
            System.out.println(a ^ 2 - 3 * a + 4);
        }
        else if ( a>=5 ) {
            System.out.println(a+7);
        }
    }
}




