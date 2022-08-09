package dsaWeek1;

import java.util.Scanner;

public class ModularExponentiation2 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = (long) Math.pow(a,b);
        System.out.println(c);


    }
}