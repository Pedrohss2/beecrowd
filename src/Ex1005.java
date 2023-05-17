import java.util.Scanner;
//Leia os valores de dois pontos flutuantes de precisão dupla A e B, correspondentes às notas de dois alunos.
// Depois disso, calcule a média do aluno, considerando que a nota A tem peso 3,5 e a B tem peso 7,5.
// Cada nota pode ser de zero a dez, sempre com um dígito após a vírgula
public class Ex1005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double notaA = 3.5;
        double notaB = 7.5;

        double media = ((A * notaA) + (B * notaB)) / 11;
        System.out.printf("MEDIA = %.5f%n", media);
    }
}
