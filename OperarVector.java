
 import java.util.Scanner;
public class OperarVector
{
    public static void main (String [] args){
        
        int mayor=0;
        int suma=0;
        int contador=0;
        
        
        Scanner teclado = new Scanner(System.in);
        int [] notas = new int [5];
      for(int i=0;i<5;i++){
          
        System.out.println ("Ingrese la nota "+ (contador+1)+ ": ");
        notas[i]= teclado.nextInt();
        contador++;
      }
        
        
        
       
        
         System.out.println ("Los numeros ingresados son: ");
         
        for(int i=0; i<notas.length;i++){
             System.out.println("   "+notas[i]);
             suma+=notas[i];
            
        }
        
        for(int i=0; i<notas.length;i++){
            if(notas[i]>mayor)
        {mayor=notas[i];
        
        }
        
    }
    
    float promedio = suma/notas.length;
    
    System.out.println ("El promedio de notas es: "+promedio);
    System.out.println ("El numero mayor es: "+mayor);
    
}
}
