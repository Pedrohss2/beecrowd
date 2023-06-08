import java.util.Scanner;

//Neste problema, sua tarefa é ler três palavras em português.
// Estas palavras definem um animal de acordo com a tabela abaixo, da esquerda para a direita.
// Após, imprima o animal escolhido definido por essas três palavras.
public class Ex1041 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome1 = input.next();
        String nome2 = input.next();
        String nome3 = input.next();

        if( nome1.equals("vertebrado") && nome2.equals("mamifero") && nome3.equals("onivoro")){
            System.out.println();
            System.out.println("homen");
        }
        if (nome1.equals("vertebrado") && nome2.equals("mamifero") && nome3.equals("herbivoro")) {
            System.out.println();
            System.out.println("vaca");
        }
        if(nome1.equals("vertebrado") && nome2.equals("ave") && nome3.equals("onivoro")){
            System.out.println();
            System.out.println("pomba");
        }
        if (nome1.equals("vertebrado") && nome2.equals("ave") && nome3.equals("carnivoro")) {
            System.out.println();
            System.out.println("aguia");
        }

        if (nome1.equals("invertebrado") && nome2.equals("anelideo") && nome3.equals("hematofago")){
            System.out.println();
            System.out.println("sanguessuga");
        }
        if(nome1.equals("invertebrado") && nome2.equals("anelideo") && nome3.equals("onivoro")){
            System.out.println();
            System.out.println("minhoca");
        }
        if(nome1.equals("invertebrado") && nome2.equals("anelideo") && nome3.equals("onivoro")){
            System.out.println();
            System.out.println("minhoca");
        }
    }

}
