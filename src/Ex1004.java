import java.util.Scanner;
//Leia dois valores inteiros.
// Depois disso, calcule o produto entre eles e armazene o resultado em uma variável chamada PROD .
// Imprima o resultado como no exemplo abaixo.
public class Ex1004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int prod = n1 * n2;
        System.out.println("Prod = " + prod);
    }
}
