package collections.two;

import java.util.Scanner;

public class PhoneNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//       System.out.println("Please enter the words : ");
//        System.out.println(getDigits(sc.next()));
        System.out.println("Please enter the digits");
        System.out.println(getWords(sc.nextLong()));


    }

    public static String getDigits(String words) {
        String result = "";

        for (int i = 0; i < words.length(); i++) {
            String s = Character.toString(words.charAt(i));
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
        return result;
    }

    public static String getWords(long digits) {
//        digits = Math.abs(digits);
        String result = "";
        int d = 0, say = 1;
        String s = String.valueOf(digits);
        ///2223334455
        s=s+" ";
        StringBuilder ardcilTiklanma= new StringBuilder("");
        for (int i = 0; i < s.length()-1 ; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                ardcilTiklanma.append(s.charAt(i ));
            } else {//2225
                ardcilTiklanma.append(s.charAt(i ));
                d = Integer.parseInt(ardcilTiklanma.toString());
                if (d == 2) {
                    result += "a";
                } else if (d == 22) {
                    result += "b";
                } else if (d == 222) {
                    result += "c";
                } else if (d == 3) {
                    result += "d";
                } else if (d == 33) {
                    result += "e";
                } else if (d == 333) {
                    result += "f";
                } else if (d == 4) {
                    result += "g";
                } else if (d == 44) {
                    result += "h";
                } else if (d == 444) {
                    result += "i";
                } else if (d == 5) {
                    result += "j";
                } else if (d == 55) {
                    result += "k";
                } else if (d == 555) {
                    result += "l";
                } else if (d == 6) {
                    result += "m";
                } else if (d == 66) {
                    result += "n";
                } else if (d == 666) {
                    result += "o";
                } else if (d == 7) {
                    result += "p";
                } else if (d == 77) {
                    result += "q";
                } else if (d == 777) {
                    result += "r";
                } else if (d == 7777) {
                    result += "s";
                } else if (d == 8) {
                    result += "t";
                } else if (d == 88) {
                    result += "u";
                } else if (d == 888) {
                    result += "v";
                } else if (d == 9) {
                    result += "w";
                } else if (d == 99) {
                    result += "x";
                } else if (d == 999) {
                    result += "y";
                } else if (d == 9999) {
                    result += "z";
                }
                ardcilTiklanma.setLength(0);
                d = 0;
            }
//            d = Integer.parseInt(String.valueOf(Math.abs((int) Math.floor(digits / Math.pow(10, Math.floor(Math.log10(digits)))))));


        }


        return result;
    }
}