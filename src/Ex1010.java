
import java.util.Locale;
import java.util.Scanner;

//Neste problema, sua tarefa é ler uma matriz A[100].
// Ao final, imprima todas as posições do array que armazenam um número menor ou igual a 10 e
// o número armazenado naquela posição.
public class Ex1010 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc =  new Scanner(System.in);

        double[] arr = new double[100];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextDouble();
            if(arr[i] <= 10) {
                System.out.printf("A[" + i + "] = " +  arr[i]);
            }
        }
        sc.close();
    }
}
