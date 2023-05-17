import java.util.Scanner;

//Leia quatro valores inteiros denominados A, B, C e D.
// Calcule e imprima a diferença do produto A e B pelo produto de C e D
public class Ex1007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            int valueA = sc.nextInt();
            int valueB = sc.nextInt();
            int valueC = sc.nextInt();
            int valueD = sc.nextInt();

            int diferença = (valueA * valueB) - (valueC * valueD);

            System.out.println("Diferença = " + diferença);
    }
}
