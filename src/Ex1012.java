import java.util.Locale;
import java.util.Scanner;

//Calcule o consumo médio
// de um automóvel tendo em conta a distância total percorrida (em Km) e o total de combustível gasto (em litros).
public class Ex1012 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        double Y = sc.nextDouble();

        double media = X / Y;
        System.out.printf("%.3f km/1 ", media);
    }
}
