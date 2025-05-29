public class Pr2 {
  public static void main(String[] args) {
    OuterClass out = new OuterClass();
    OuterClass.InnerClass in = out.new InnerClass();
    out.printData();
    in.display();
  }  
}
class OuterClass{
    int out = 50;
    class InnerClass{
        int in = 100;
        void display(){
            System.out.println("Outer class variable: " + out);
            System.out.println("Inner class variable: " + in);
        }
    }
    void printData()
    {
        System.out.println("Outer class method");
    }
}
