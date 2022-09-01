package hackerRank;

import java.util.Scanner;

public class EndOfFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 1;

        while (sc.hasNextLine()) {
            String line = sc.nextLine();

            System.out.println(counter + " " + line);
            counter += 1;
        }

    }
}
