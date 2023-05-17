import java.util.Locale;
import java.util.Scanner;

//A fórmula para calcular a área de uma circunferência é definida como A = π . R 2 .
// Considerando para este problema que π = 3,14159 :
//
//Calcule a área usando a fórmula fornecida na descrição do problema
public class Ex1002 {
    public static final double PI =  3.14159;
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double R = sc.nextDouble();
        double calc = PI * Math.pow(R, 2);
        System.out.printf("%.4f%n", calc);

        sc.close();
    }
}
