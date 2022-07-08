public class TrianguloHer extends AreaHer{
    private String figura = "Triángulo";
    public double area(){
        return dimension1*dimension2/2;
    }
    public static void main(String[] args) {
        TrianguloHer obj1 = new TrianguloHer();
        System.out.println(obj1.figura);
        obj1.mostrarDimensiones();
        System.out.println(obj1.area());
    }
}
