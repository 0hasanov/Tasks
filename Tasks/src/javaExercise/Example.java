package javaExercise;

public class Example {
    public static void main(String[] args) {
        int a = 5;
        ConsolaYazdir C = System.out::println;
        C.out(a);
    }

}
@FunctionalInterface
 interface ConsolaYazdir{
    void out(int b);

}
