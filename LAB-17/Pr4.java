class PrintValue{
    PrintValue(int x){
        System.out.println("Print Int Value: " + x);
    }
    PrintValue(double y){
        System.out.println("Print Double Value: " + y);
    }
    PrintValue(String z){
        System.out.println("Print String Value: " + z);
    }
}

class Pr4 {
    public static void main(String[] args) {
        PrintValue p1 = new PrintValue(10);
        PrintValue p2 = new PrintValue(10.5);
        PrintValue p3 = new PrintValue("Hello World");
    }
}
