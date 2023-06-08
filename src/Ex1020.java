import java.util.Scanner;
//Lê um valor inteiro correspondente à idade de uma pessoa (em dias) e imprime-o em anos
// , meses e dias, seguido da respectiva mensagem “ano(s)”, “mes(es)”, “dia(s)”.
//Obs: só para facilitar o cálculo, considere o ano todo
// com 365 dias e 30 dias todos os meses. Nos casos de
// teste nunca haverá uma situação que permita 12 meses e alguns dias,
// como 360, 363 ou 364. Este é apenas um exercício com o objetivo de testar raciocínio matemático simples.
public class Ex1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        int ano = age / 365;
        int restoAno = age % 365;
        int meses = restoAno / 30;
        int dias =  restoAno % 30;


        System.out.println(ano + "ano(s)" + meses + "mês(es)" + dias + "dia(s)");

    }
}
