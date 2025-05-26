public class Pr1 {
    public static void main(String[] args) {
        String str = "  Hello Welcome to Java World  ";
        System.out.println("Length: " + str.length());

        System.out.println("Character at index 6: " + str.charAt(6));

        String newStr = str.concat(" - Enjoy Coding");
        System.out.println("Concatenated: " + newStr);

        
        System.out.println("Index of 'Java': " + str.indexOf("Java"));

        
        System.out.println("Equals 'Hello Welcome to Java World'? " + str.equals("Hello Welcome to Java World"));

       
        int num = 100;
        String strVal = String.valueOf(num);
        System.out.println("String value of 100: " + strVal);

        
        System.out.println("toString(): " + str.toString());

       
        System.out.println("Trimmed: '" + str.trim() + "'");

        
        System.out.println("Substring (7 to 11): " + str.substring(7, 11));
    }
}
