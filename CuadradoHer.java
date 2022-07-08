public class CuadradoHer extends AreaHer{ //clase hija o sub clase de la clase Area
    private String figura = "Rectangulo";
    public double area(){
        return dimension1 * dimension2;
    }
    public static void main(String[] args) {
        CuadradoHer obj1 = new CuadradoHer();
        System.out.println(obj1.figura);
        obj1.mostrarDimensiones();
        System.out.println(obj1.area());

    }

    
}
