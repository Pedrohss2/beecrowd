import java.io.PrintStream;
import java.util.Scanner;

public class Ex1145 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();

        for (int i = 1; i <= Y; i++) {
            if (i % X == 1) {
                System.out.println();
            }
            System.out.print(i + " ");
        }

        sc.close();
    }
}
