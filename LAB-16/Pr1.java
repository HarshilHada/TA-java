public class Pr1 {
    public static void main(String[] args) {
        int num = 10; 
        Integer obj = num;   
        System.out.println("Autoboxing:int " + num + " to Integer " + obj); 
 
        Integer obj2 = Integer.valueOf(50);   
        int num2 = obj2;   
        System.out.println("Unboxing: Integer " + obj2 + " to int " + num2); 
 
        Integer obj3 = 80;   
        int result = obj3 + 20;  
        System.out.println("Result of obj3 + 20 = " + result); 
    } 
} 

  
