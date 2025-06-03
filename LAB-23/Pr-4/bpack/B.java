package bpack;

import apack.A;

public class B extends A {
    public void display() {
        System.out.println("Inside class B (subclass of A in different package):");
        // System.out.println("Private Var: " + privateVar); // ❌ Not accessible
        System.out.println("Protected Var: " + protectedVar); // ✅ Accessible via inheritance
        System.out.println("Public Var: " + publicVar);       // ✅ Accessible
    }
}
