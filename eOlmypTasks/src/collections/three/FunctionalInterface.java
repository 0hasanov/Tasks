package collections.three;

import java.util.Scanner;

public class FunctionalInterface implements FuncInt {


    public static void main(String[] args) {
        System.out.println("Please enter the word: ");
        System.out.println(countSymbol(""));
        System.out.println("Please enter the words: ");
        System.out.println( + countWords(""));
    }



    public static int countSymbol(String word) {
        Scanner sc = new Scanner(System.in);
        word = sc.next();
        int stringLength = word.length();

        return stringLength;
    }

    public static int countWords(String words) {
        Scanner sc = new Scanner(System.in);
        //words = sc.next();
        words = "Hello World";
        int wordLength = words.split("\\s").length;

        return wordLength;
    }

    @Override
    public int countSymbol() {
        return 0;
    }
    public int countWords(){
        return 0;
    }
}


