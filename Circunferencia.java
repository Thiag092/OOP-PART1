

public class Circunferencia {
    public static void main(String [] args) {
        

        int radio = Integer.parseInt(args [0]);
        float pi = 3.14f;

        float circunferencia = 2 * pi * radio;

        System.out.println("La circunferencia es: " + circunferencia);
    }
}