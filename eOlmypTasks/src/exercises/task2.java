package exercises;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        int i;
        int m=0;
        int flag=0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        m=n/2;
        if(n==0||n==1)
        {
            System.out.println("complex");
        }
        else  {
            for(i=2;i<=m;i++) {
                if(n%i==0) {
                    System.out.println("complex");
                    flag=1;
                    break;
                }
            }
            if(flag==0)  {
                System.out.println("prime ");
            }
        }
    }
}
