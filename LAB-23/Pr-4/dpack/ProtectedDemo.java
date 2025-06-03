package dpack;

import bpack.B;
import cpack.C;

public class ProtectedDemo {
    public static void main(String[] args) {
        B objB = new B();
        C objC = new C();

        objB.display();
        System.out.println();
        objC.display();
    }
}
