package pp1Week2Contest2;

import java.util.Scanner;

public class ConditionalStatement4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();


        x= x >= 0 ? Math.pow(x,3)+ 2*x*x + 4*x -6 : Math.pow(x,3)-7*x ;
        int y = (int) x;
        System.out.println(y);
        }
    }
