import java.util.Scanner;

public class Tablas {
    // metodos (funciones)
    // propiedades (variables)
    // main
    // variables privadas solo son vistas dentro de la clase
    public void capturaDatos(){ // método sin parametros
        Scanner sc = new Scanner(System.in);
        int tablaMul;
        do{
            System.out.println("Digite la tabla de multiplicar que desea, o \"-1\" para finalizar");
            tablaMul = sc.nextInt();
            if (tablaMul!=-1){
                mostrarTabla(tablaMul);
            }
            
        }while(tablaMul != -1); 
        sc.close();
    }
    public void mostrarTabla(int valor){
        for (int i= 1; i<11; i++){
            System.out.println(valor+" * "+i+ " = "+ valor*i);
        }
    }
    public static void main(String[] args){
        Tablas tabla1 = new Tablas(); // creamos un objeto de la clase Tablas
        tabla1.capturaDatos();
    
    }


}
