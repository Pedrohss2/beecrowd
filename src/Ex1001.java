import java.util.Scanner;

//Leia 2 variáveis, denominadas A e B e faça a soma dessas duas variáveis,
// atribuindo seu resultado à variável X . Imprima X como mostrado abaixo.
// Imprima a linha final após o resultado
public class Ex1001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int X = A + B;
        System.out.println("X = " + X);
    }
}
