import java.util.Scanner;

//Faça um programa que leia o nome do vendedor,
// seu salário fixo e o total da venda feita por ele no mês (em dinheiro).
// Considerando que este vendedor recebe 15% sobre todos os produtos vendidos,
// escreva o salário final (total) deste vendedor no final do mês, com duas casas decimais.
public class Ex1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        double salary = sc.nextDouble();
        double salesAmount = sc.nextDouble();

        double salaryFinal = salary + salesAmount * 0.15;
        System.out.printf("Total = %.2f%n" , salaryFinal);
    }
}
