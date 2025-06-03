package cpack;

import apack.A;

public class C {
    public void display() {
        A obj = new A();
        System.out.println("Inside class C (non-subclass of A in different package):");
        // System.out.println("Private Var: " + obj.privateVar);   // ❌ Not accessible
        // System.out.println("Protected Var: " + obj.protectedVar); // ❌ Not accessible
        System.out.println("Public Var: " + obj.publicVar);       // ✅ Accessible
        System.out.println("Private Var (via method): " + obj.getPrivateVar()); // ✅ via public method
    }
}
