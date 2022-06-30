public class Atributos {
    // atributos
    private String nombre = "Juan";
    private String cargo = "Gerente";
    int edad = 46;
    final int CODIGO = 457896; //cuando el dato debe ser una constante y su nombre debe ser en mayúscula sostenida
    //metodo
    public void imprimir(){
        System.out.println(nombre);
        System.out.println(cargo);
        System.out.println(edad);
        System.out.println(CODIGO);
    }
    public static void main(String[] args) {
        Atributos obj1 = new Atributos();
        obj1.imprimir();
        System.out.println(obj1.edad);
        obj1.cargo = "Subgerente";
        obj1.imprimir();
        //obj1.CODIGO = 568742; no se puede porque es un campo final
    }


}
