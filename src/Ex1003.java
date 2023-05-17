
import java.util.Scanner;

//Leia dois valores inteiros, no caso, as variáveis A e B.
// Depois disso, calcule a soma entre eles e atribua à variável SOMA
// . Escreva o valor dessa variável.
public class Ex1003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int sum = A + B;
        System.out.println("SOM = " + sum);
    }
}
