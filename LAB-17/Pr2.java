
public class Pr2 {
    public static void main(String[] args) {
        int a=10;
        System.out.println("Calling constructor with parameter:");
        Sample s = new Sample(a);
        System.out.println("Calling default constructor:");
        Sample s1 = new Sample();
    }    
}
class Sample{
    Sample(int a) {
        System.out.println("Value of a is: " + a);
    }
    Sample() {
        System.out.println("Default constructor called");
    }
    
}
