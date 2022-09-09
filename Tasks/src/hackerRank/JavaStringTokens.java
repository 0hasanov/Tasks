package hackerRank;


import java.util.Scanner;

public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String word = sc.nextLine();
        String[] arrofStr = word.split("[ ',]");
        for (String a : arrofStr) {
            count++;
            System.out.println(a);


        }
        System.out.println(count-1);
    }
}

