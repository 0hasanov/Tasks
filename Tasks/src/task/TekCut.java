package task;

public class TekCut {
    public void ededhesablamaq() {
        int count = 0;
        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0) {
                System.out.printf("%s cut ededdir!", "\n" + i);

            } else {
                System.out.printf("%s tek ededdir!", "\n" + i);

            }
            count++;
        }
        System.out.println("\n" + "Ededlerin sayi: " + count);

    }
}