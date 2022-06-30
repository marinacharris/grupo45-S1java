import java.util.Scanner;

public class Calcular {
    public void capturaDatos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el primer valor");
        double valor1 = sc.nextDouble();
        System.out.println("Digite el segundo valor");
        double valor2 = sc.nextDouble();
        sc.close();
        System.out.println(suma(valor1, valor2));
        System.out.println(resta(valor1, valor2));
        System.out.println(multi(valor1, valor2));
        System.out.println(divi(valor1, valor2));
        
    }
    public double suma(double v1, double v2){
        return v1 + v2; 
    }
    public double resta(double v1, double v2){
        return v1 - v2; 
    }
    public double multi(double v1, double v2){
        return v1 * v2; 
    }
    public double divi(double v1, double v2){
        return v1 / v2; 
    }
    public static void main(String[] args) {
        Calcular obj1 = new Calcular();
        obj1.capturaDatos();
        System.out.println(obj1.suma(45,67)); 
    }
    
}
