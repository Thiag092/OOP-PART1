import java.util.Scanner;

public class Ecuación {
    
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese primer valor: ");
        double a = scanner.nextDouble();

        System.out.print("Ingrese segundo valor: ");
        double b = scanner.nextDouble();

        System.out.print("Ingrese tercer valor: ");
        double c = scanner.nextDouble();
        
     
       double discriminante= (Math.pow(b,2)) - 4 * a * c;
    

        if (discriminante > 0) {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Las racies son: x1: " + x1 + ", x2 = " + x2);
        } else if (discriminante == 0) {
            double x = -b / (2 * a);
            System.out.println("La raiz es: " + x);
        } else {
            System.out.println("TIENE RAIZ COMPLEJA");
        }
    }

    
}

