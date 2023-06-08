import java.util.Scanner;

public class Ex1142 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entrada = sc.nextInt();
        int c = 1;
        for (int i =0; i < entrada; i++){
            System.out.print(c  + " ");
            System.out.print(c + 1 + " ");
            System.out.print(c + 2 + " ");
            System.out.println("PU");

            c += 4;
        }
    }
}
