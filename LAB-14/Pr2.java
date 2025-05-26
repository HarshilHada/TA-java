
public class Pr2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java Programming");

        
        sb.append(" Programming");
        System.out.println("After append: " + sb);

        
        sb.insert(5, "is ");
        System.out.println("After insert: " + sb);

        
        sb.delete(5, 8); 
        System.out.println("After delete: " + sb);

       
        System.out.println("Reversed: " + sb.reverse());

        
        System.out.println("Character at index 2: " + sb.charAt(2));

        
        System.out.println("Capacity: " + sb.capacity());

        
        System.out.println("StringBuffer as string: " + sb.toString());

        
        sb.reverse(); 
        sb.replace(0, 4, "Core");
        System.out.println("After replace: " + sb);
    }
}

