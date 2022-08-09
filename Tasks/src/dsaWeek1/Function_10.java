package dsaWeek1;

import java.util.Scanner;
import java.util.function.Function;

public class Function_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (m == 0 || m ==n ){
            System.out.println("1");
        }
        else if (m<n && 0 < m && 0 < n ){
            //System.out.println(function(m-1,n-1) +function(m,n-1));
        }
    }
}
