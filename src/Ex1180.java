import java.util.Scanner;

public class Ex1180 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] vect = new int[N]; // Vect com N valores

        for(int i = 0; i < N ; i++){
             vect[i] = sc.nextInt();
        }

        int menorValor = vect[0];
        for(int i = 1; i < N; i++){

           if(vect[i] < menorValor ){
               menorValor = vect[i];
               System.out.println("Menor " + menorValor);
               System.out.println("Posição " + i);
           }
        }

        sc.close();
    }
}
