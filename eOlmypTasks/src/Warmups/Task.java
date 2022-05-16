package Warmups;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Daxil edin");

        String str = sc.next();
        String replace = str.replace('x', ' ');
        String trim = replace.trim();
        trim = trim.replace(" ","x");
        System.out.println(trim);


//        String str = "CCC111aZeRCCCCbaIJanCCCCCCC";
//        String replace = str.replace('C', ' ');
//        String substring = replace.substring(0, 10) + "CCCC" + replace.substring(14, 21);
//        String trim = substring.trim();
//        System.out.println(trim);
    }

}
