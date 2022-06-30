import javax.swing.event.DocumentEvent;

public class Constructor {
    // El método constructor se utiliza para inicializar los atributos de la clase
    // El nombre del método constructor debe coincidir con el nombre de la clase
    // El método constructor no retorna datos
    private String nombre;
    private int nota; 
    private double sueldo;
    private boolean docenteCoordinador;
    public Constructor(String nombre, int nota){
        this.nombre = nombre; // This diferencia los atributos de la clase de los parametros del método
        this.nota = nota;
    }
    public Constructor(String nombre, double sueldo, boolean docenteCoordinador ){
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.docenteCoordinador = docenteCoordinador;
    }
    // sobrecarga de métodos, es cuado tengo dos o mas mpetodos con el mismo nombre, pero debe ser diferentes en cantidad de parámetros o tipo de datos de los parámetros.

    public static void main(String[] args) {
        Constructor obj1 = new Constructor("Ana",5); //Al crear la instancia se ejecuta el constructo
        System.out.println(obj1.nombre);
        System.out.println(obj1.nota);
        Constructor obj2 = new Constructor("Miguel",4000000,false);
        System.out.println(obj2.nombre);
        

    }
    
    
}
