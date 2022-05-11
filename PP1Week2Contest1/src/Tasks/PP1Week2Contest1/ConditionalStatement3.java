package Tasks.PP1Week2Contest1;
import java.util.Scanner;
public class ConditionalStatement3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a<-4) {
            System.out.println(a + 5);
        }
        if (-4<=a && a<=7) {
            System.out.println(Math.pow(a, 2) - 3 * a);
        }
        else if (a>7) {
            System.out.println(Math.pow(a,3)+ 2*a );
        }

            }

        }
