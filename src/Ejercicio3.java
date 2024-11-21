import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double horasTrabajadas = scanner.nextDouble();
        double tarifa = scanner.nextDouble();
        double sueldo;

        if (horasTrabajadas > 40) {
            double horasExtra = horasTrabajadas - 40;
            sueldo = (horasTrabajadas * tarifa) + horasExtra * (tarifa * 1.5);
        }
        else{
            sueldo = (horasTrabajadas * tarifa); 
        }

        System.out.println(sueldo);
        scanner.close(); 
    }
    
}
