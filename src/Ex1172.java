import java.util.Scanner;

public class Ex1172 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vect = new int[10];


        for(int i = 0; i < vect.length; i++){
            // Add value in my array
             vect[i] = sc.nextInt();

             if(vect[i] == 0 || vect[i] < 0){
                 vect[i] = 1;
                 System.out.println("x[" + i + "] = "  + vect[i]);
            }
           else {
                 System.out.println("x[" + i + "] = "  + vect[i]);
             }
        }
        sc.close();

    }
}
