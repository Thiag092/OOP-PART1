public class Trectangulo
{
    public static void main (String [] args){
        
        
        double hipotenusa= Double.parseDouble(args [0]);
        double cateto1=Double.parseDouble(args [1]);
        double cateto2=Double.parseDouble(args [2]);
        
        if ((Math.pow(hipotenusa,2)) == ((Math.pow (cateto1, 2)) + (Math.pow(cateto2,2))))
        {System.out.println ("Los valores coinciden con un triangulo recto");}
        else{System.out.println("Los vlores ingresados no pertenecen a un triangulo recto");}
        
        
        
    }
    
}
