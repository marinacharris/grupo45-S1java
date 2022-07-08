public class Principal {
    public static void main(String[] args) {
       Secundaria obj1 = new Secundaria();
       System.out.println(obj1.getNombre());
       obj1.setNombre("Ana"); 
       System.out.println(obj1.getNombre());
    }
// Encapsulamiento, se utiliza para ocultar atributos de un objeto y solo pueden seaccedidos,
// con los metodos del objeto (getters y setters)
}