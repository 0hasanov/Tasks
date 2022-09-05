package hackerRank;

import java.math.BigDecimal;
import java.text.FieldPosition;
import java.text.Format;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Locale;
import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number = sc.nextDouble();

        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String moneyStringUS = us.format(number);
        String moneyStringINDIA = india.format(number);
        String moneyStringCHINA = china.format(number);
        String moneyStringFRANCE = france.format(number);
        System.out.println("US: " + moneyStringUS);

        System.out.println("INDIA: " + moneyStringINDIA);
        System.out.println("CHINA: " + moneyStringCHINA);
        System.out.println("FRANCE: " + moneyStringFRANCE);


    }

}
