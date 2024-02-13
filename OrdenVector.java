import java.util.Scanner;
import java.lang.Math;

public class OrdenVector{

    public static void main (String [] args){
    
    Scanner ingreso = new Scanner(System.in);
    
    double[] vector = new double[4];
    
    
    for(int i=0;i<4;i++){
    
        System.out.println("ingrese el valor "+(i+1));
        vector[i] = ingreso.nextDouble();
    }
    
    double menor=99999;
    
    for(int i=0;i<4;i++){
        
        if(vector[i]<menor){
        menor=vector[i];
        }
    
    }
    
    for(int i=0;i<3;i++){
    
        for(int x=0;x<3;x++){
        if(vector[x] > vector[x+1]){
        
            double aux=vector[x];
            vector[x] = vector[x+1];
            vector[x+1] = aux;
        
            }
        }
    }
    
    for(int i=0;i<4;i++){
    System.out.println(vector[i]);
    
    }
    System.out.println("El menor elemento es: "+menor);
    
    }

}
