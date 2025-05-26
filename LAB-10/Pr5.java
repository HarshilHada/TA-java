import java.util.Scanner;
public class Pr5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] a = new int[3][3];
        int [][] b = new int[3][3];
        int [][] c = new int[3][3];
        System.out.println("Enter Elements of Matrix A:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter Elements of Matrix B:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("Multiplication of Matrix A and B is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    c[i][j]= c[i][j] + a[i][k] * b[k][j];
                }
            }
        }

    }
}
