package task;

import java.io.IOException;

import static task.ReverseString.inPlaceReverse;

public class Main {
    public static void main(String[] args) throws IOException {
//        CountWord countWord = new CountWord();
//        countWord.writeText();
//        countWord.readText();
//        TekCut fromOneToHundred = new TekCut();
//        fromOneToHundred.ededhesablamaq();
        String number = "Naber Kanka";
        System.out.println("original String: " + number);
        String reversed = inPlaceReverse(number);
        System.out.println("reversed String: " + reversed);

    }
}
