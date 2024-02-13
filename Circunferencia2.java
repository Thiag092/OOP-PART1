
import java.util.Scanner;
public class Circunferencia2 {
    public static void main(String [] args) {
        Scanner teclado = new Scanner(System.in);
        
        
        int respuesta=1;
        
        
        while (respuesta==1){
            
            System.out.println("Ingrese valor del radio: ");
        int radio = teclado.nextInt();
        double pi = 3.14;
        
        double circunferencia = 2 * pi * radio;
        

        System.out.println("La circunferencia es: " + circunferencia);
        
        System.out.println ("Desea calculcular la circunferencia? (1=Si/0=No)");
         respuesta = teclado.nextInt();
        }
       System.out.println("GRACIAS POR UTILIZAR EL PROGRAMA");
    }
}