interface Greeting { 
    void sayHello(); 
} 
 
public class Pr3 { 
    public static void main(String[] args) { 
        Greeting greet = new Greeting() { 
            @Override 
            public void sayHello() { 
                System.out.println("Hello from anonymous inner class!"); 
            } 
        }; 
 
        greet.sayHello(); 
    } 
}