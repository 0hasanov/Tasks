package hackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class JavaRegex {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new Regex().pattern));
        }

    }
}

 class Regex {
    String ip0To255 = "(\\d{1,2}||(0|1)\\d{2}||2[0-4]\\d||25[0-5])";
    String pattern  = ip0To255 + "[.]" + ip0To255 + "[.]" + ip0To255 + "[.]" + ip0To255;
}

