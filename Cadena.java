public class Cadena {
    public static void main(String[] args){
        String ciudad = "Barranquilla";
        System.out.println(ciudad.length());
        System.out.println(ciudad.toUpperCase());
        System.out.println(ciudad.equals("BarranquillA"));
        System.out.println(ciudad.indexOf("a"));
        System.out.println("La ciudad de "+ ciudad + " es conocida como \"La Arenosa\""); // \', \", \\
    }
       
}
