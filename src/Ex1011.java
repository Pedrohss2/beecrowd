import java.util.Scanner;

//Faça um programa
// que leia 3 valores inteiros e apresente o maior seguido
// da mensagem "eh o maior"
public class Ex1011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B , C, maior = 0;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();

        if(A > maior) {
            maior = A;
        }
        if(B > A) {
            maior = B;
        }
        if(C > B){
            maior = C;
        }
        System.out.println(maior + " É eh o maior");
    }
}
