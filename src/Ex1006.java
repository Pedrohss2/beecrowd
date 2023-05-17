import java.util.Locale;
import java.util.Scanner;

//Leia três valores (variáveis , B e C), que são as três notas do aluno.
// Em seguida, calcule a média, considerando que a nota A tem peso 2,
// a nota B tem peso 3 e a nota C tem peso 5. Considere que cada nota pode ir de 0 a 10,0, sempre com uma casa decimal.
public class Ex1006 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double pesoA = 2.0;
        double pesoB = 3.0;
        double pesoC = 5.0;

        double media = ((A * pesoA) + (B * pesoB) + (C * pesoC)) / 10.0;

        System.out.printf("Media = %.1f%n", media);
    }
}
