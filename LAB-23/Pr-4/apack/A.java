package apack;

public class A {
    protected int protectedVar = 100;
    private int privateVar = 200;
    public int publicVar = 300;

    public int getPrivateVar() {
        return privateVar; // to allow access through method
    }
}
