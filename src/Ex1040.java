import java.util.Locale;
import java.util.Scanner;

public class Ex1040 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double  nota1, nota2, nota3, nota4;

        nota1 = sc.nextDouble();
        nota2 = sc.nextDouble();
        nota3 = sc.nextDouble();
        nota4 = sc.nextDouble();
        double totalDenotas = (nota1 * 2.0 + nota2 * 3.0 + nota3 * 4.0 + nota4 ) / 10;


        System.out.printf("Media = %.1f%n ", totalDenotas);

        if(totalDenotas >= 70.0){
            System.out.println("ALUNO APROVADO");
        }
        else if(totalDenotas < 5.0){
            System.out.println("Reprovado");
        }
        else {
            System.out.println("Aluno em exame");
            double nota5 = sc.nextDouble();
            double media = (totalDenotas + nota5) / 2;

            System.out.printf("Nota do exame = %.1f%n " , nota5);

            if(media >=  50){
                System.out.println("Aluno aprovado");
            }
            else {
                System.out.println("Reprovado");
            }
            System.out.printf("Media final  = %.1f%n", media );
        }
    }
}
