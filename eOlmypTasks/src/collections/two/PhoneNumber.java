package collections.two;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the phone number: ");
//        int str = sc.nextInt();
//
//
//        switch (str) {
//            case 2:
//                System.out.println("a");
//                break;
//            case 22:
//                System.out.println("b");
//                break;
//            case 222:
//                System.out.println("c");
//                break;
//            case 3:
//                System.out.println("d");
//                break;
//            case 33:
//                System.out.println("e");
//                break;
//            case 333:
//                System.out.println("f");
//                break;
//            case 4:
//                System.out.println("g");
//                break;
//            case 44:
//                System.out.println("h");
//                break;
//            case 444:
//                System.out.println("i");
//                break;
//            case 5:
//                System.out.println("j");
//                break;
//            case 55:
//                System.out.println("k");
//                break;
//            case 555:
//                System.out.println("l");
//                break;
//            case 6:
//                System.out.println("m");
//                break;
//            case 66:
//                System.out.println("n");
//                break;
//            case 666:
//                System.out.println("o");
//                break;
//            case 7:
//                System.out.println("p");
//                break;
//            case 77:
//                System.out.println("q");
//                break;
//            case 777:
//                System.out.println("r");
//                break;
//            case 7777:
//                System.out.println("s");
//                break;
//            case 8:
//                System.out.println("t");
//                break;
//            case 88:
//                System.out.println("u");
//                break;
//            case 888:
//                System.out.println("v");
//                break;
//            case 9:
//                System.out.println("w");
//                break;
//            case 99:
//                System.out.println("x");
//                break;
//            case 999:
//                System.out.println("y");
//                break;
//            case 9999:
//                System.out.println("z");
//
//        }
        System.out.println(getDigits(sc.next()));

    }

    public static int getDigits(String test) {
        String result = "";
        String param = test.toUpperCase();
        for (int i = 0; i < param.length(); i++) {
            String s = Character.toString(param.charAt(i));
            if (s.equalsIgnoreCase("A")) {
                result += 2;
            }
            else if (s.equalsIgnoreCase("B")) {
                result += 22;
            }
            else if (s.equalsIgnoreCase("C")) {
                result += 222;
            }
            else if (s.equalsIgnoreCase("D")) {
                result += 3;
            }
            else if (s.equalsIgnoreCase("E")) {
                result += 33;
            }
            else if (s.equalsIgnoreCase("F")) {
                result += 333;
            }
            else if (s.equalsIgnoreCase("G")) {
                result += 4;
            }
            else if (s.equalsIgnoreCase("H")) {
                result += 44;
            }
            else if (s.equalsIgnoreCase("I")) {
                result += 444;
            }
            else if (s.equalsIgnoreCase("J")) {
                result += 5;
            }
            else if (s.equalsIgnoreCase("K")) {
                result += 55;
            }
            else if (s.equalsIgnoreCase("L")) {
                result += 555;
            }
            else if (s.equalsIgnoreCase("M")) {
                result += 6;
            }
            else if (s.equalsIgnoreCase("N")) {
                result += 66;
            }
            else if (s.equalsIgnoreCase("O")) {
                result += 666;
            }
            else if (s.equalsIgnoreCase("P")) {
                result += 7;
            }
            else if (s.equalsIgnoreCase("Q")) {
                result += 77;
            }
            else if (s.equalsIgnoreCase("R")) {
                result += 777;
            }
            else if (s.equalsIgnoreCase("S")) {
                result += 7777;
            }
            else if (s.equalsIgnoreCase("T")) {
                result += 8;
            }
            else if (s.equalsIgnoreCase("U")) {
                result += 88;
            }
            else if (s.equalsIgnoreCase("V")) {
                result += 888;
            }
            else if (s.equalsIgnoreCase("W")) {
                result += 9;
            }
            else if (s.equalsIgnoreCase("X")) {
                result += 99;
            }
            else if (s.equalsIgnoreCase("Y")) {
                result += 999;
            }
            else if (s.equalsIgnoreCase("Z")) {
                result += 9999;
            }
        }
        return Integer.parseInt(result);
    }
}

//        HashMap phonekeys = new HashMap();
//        phonekeys.put("a", "2");
//        phonekeys.put("b", "22");
//        phonekeys.put("c", "222");
//        phonekeys.put("d", "3");
//        phonekeys.put("e", "33");
//        phonekeys.put("f", "333");
//        phonekeys.put("g", "4");
//        phonekeys.put("h", "44");
//        phonekeys.put("i", "444");
//        phonekeys.put("j", "5");
//        phonekeys.put("k", "55");
//        phonekeys.put("l", "555");
//        phonekeys.put("m", "6");
//        phonekeys.put("n", "66");
//        phonekeys.put("o", "666");
//        phonekeys.put("p", "7");
//        phonekeys.put("q", "77");
//        phonekeys.put("r", "777");
//        phonekeys.put("s", "7777");
//        phonekeys.put("t", "8");
//        phonekeys.put("u", "88");
//        phonekeys.put("v", "888");
//        phonekeys.put("w", "9");
//        phonekeys.put("x", "99");
//        phonekeys.put("y", "999");
//        phonekeys.put("z", "9999");