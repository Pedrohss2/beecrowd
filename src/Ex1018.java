import java.util.Scanner;

//Neste problema você deve ler um valor inteiro e calcular o
// menor número possível de notas em que o valor pode ser decomposto. As notas possíveis são 100, 50, 20, 10, 5, 2 e 1.
// Imprima o valor lido e a lista de notas.
public class Ex1018 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int value = sc.nextInt();
            System.out.println(value);

            int cem = value / 100;
            value = value % 100;
            System.out.println(cem  + "notas de R$100,00");

            int cinquenta = value / 50;
            value = value % 50;
            System.out.println(cinquenta + " notas de R$50,00");

            int vinte = value / 20;
            value = value % 20;
            System.out.println(vinte + " notas de R$20,00");

            int dez = value / 10;
            value = value % 10;
            System.out.println(dez + " notas de R$10,00");

            int cinco = value / 5;
            value = value % 5;
            System.out.println(cinco + " notas de R$5,00");

            int dois = value / 2;
            value = value % 2;
            System.out.println(dois + " notas de R$2,00");

            int um = value / 1;
            value = value % 1;
            System.out.println(um + " notas de R$1,00");

    }
}
