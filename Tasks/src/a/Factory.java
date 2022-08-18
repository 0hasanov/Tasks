package a;

import b.Example;
import b.Example1;
import b.Example2;
import b.Example3;

public class Factory {
    public static void main(String[] args) {
        Example example1 = new Example1();
        example1.deneme();
        Example example2 = new Example2();
        example2.deneme();
        Example example3 = new Example3();
        example3.deneme();
    }

}
