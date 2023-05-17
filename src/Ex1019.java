import java.util.Scanner;

//Lê um valor inteiro,
// que é a duração em segundos de um determinado evento em uma fábrica, e informa-o expresso em horas:minutos:segundos.
public class Ex1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int hora = N / 3600;
        int restoHora = N % 3600;
        int minuto = restoHora / 60;
        int restoM = N % 60;

        System.out.println(hora + ":"+ minuto +  ":" + restoM);

    }
}
