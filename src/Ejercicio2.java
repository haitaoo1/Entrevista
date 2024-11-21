import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2 {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        List<Persona> personas  = new ArrayList<>();

        for(int i = 0; i < 50; i++){
           
            String sexo = scanner.next();
            int edad = scanner.nextInt();
            Persona persona = new Persona(sexo,edad);
            personas.add(persona);
        }
        scanner.close();
        print(personas);
    }

    private static void print(List<Persona> personas){
        int mayoresEdad = 0, menoresEdad = 0, mascMayores = 0, femMenores = 0, mujeres = 0;
        

        for(Persona persona : personas){
            if (persona.getEdad() >= 18) {
                mayoresEdad++;
                if (persona.getSexo().equals("Hombre")) {
                    mascMayores++;
                }
                
            }else{
                menoresEdad++;
                if (persona.getSexo().equals("Mujer")) {
                    femMenores++;
                }
            }
            if(persona.getSexo().equals("Mujer")){
                mujeres++;
            }

        }

        double porcentajeMayores = (mayoresEdad * 100.0) /personas.size();
        double porcentajeMujeres = (mujeres * 100.0) /personas.size();
        
        System.out.println("Cantidad de personas mayores de edad: "+ mayoresEdad);
        System.out.println("Cantidad de personas menores de edad: " + menoresEdad);
        System.out.println("Cantidad de personas masculinas mayores de edad: " + mascMayores);
        System.out.println(". Cantidad de personas femeninas menores de edad: " + femMenores);
        System.out.println("Porcentaje que representan las personas mayores de eda :" + porcentajeMayores);
        System.out.println("Porcentaje que representan las mujeres: " + porcentajeMujeres);

    }

    
    
}
