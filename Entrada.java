import java.util.Scanner;

public class Entrada {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite su nombre");
        String nom = sc.nextLine();
        System.out.println("Digite su edad");
        int ed = sc.nextInt();
        sc.close();
        System.out.println("Te llamas "+ nom + " y tienes "+ ed +" años");
    }
}
