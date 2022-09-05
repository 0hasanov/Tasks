package deneme;

import java.util.Scanner;

public class Size {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "";
        while (true) {
            String menu = "1.Write size\n2.Exit\n" +
                    "Please choose one!";
            System.out.println(menu);
            input = new Scanner(System.in).nextLine();
            if (input.equalsIgnoreCase("write size") || input.equals("1")) {
                System.out.println("Write size !");
                int number = sc.nextInt();


                for (int i = 0; i < number; i++) {
                    if (number < 31) {
                        System.out.println("Small!");
                        break;
                    } else if (number < 51) {
                        System.out.println("Medium!");
                        break;
                    } else if (number < 71) {
                        System.out.println("Large!");
                        break;
                    } else {
                        System.out.println("Extra Large!");
                        break;
                    }

                }
//                System.out.println("Size: " + size);
            } else if (input.equalsIgnoreCase("exit") || input.equalsIgnoreCase("2")) {

            } else {
                System.out.println("Wrong input!Please try again");
            }

        }

    }
}