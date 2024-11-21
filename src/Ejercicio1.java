import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        if (numero % 2 == 0) {
            for (int i = numero; i >= 0 ; i-=2) {
                System.out.println(i);
            }
        }else{
            for (int i = numero; i >= 1 ; i-=2) {
                System.out.println(i);
        }
     }   
       scanner.close(); 
    }

}
