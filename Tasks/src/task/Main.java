package task;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CountWord countWord = new CountWord();
        countWord.writeText();
        countWord.readText();

    }
}
