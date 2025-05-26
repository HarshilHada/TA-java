public class Pr3 {
    public static void main(String[] args) {
        String input = "Java is a powerful programming language";
        String[] words = input.split(" ");
        System.out.println("Even length words:");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() % 2 == 0) {
                System.out.println(words[i]);
            }
        }
    }
}
