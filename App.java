public class App {
    public static void main(String[] args) throws Exception {
        //Comentario de una línea
        /*
         Comentario de dos o mas lineas
         Otra línea
         */
        // declaracion de una variables
        
        System.out.println("Hola mundo");
        int num = 0;
        String nombre = "Marina";
        System.out.println(nombre);
        double num2 = 4.5;
        boolean sw = true;
        var num3 = 4;
        var apellido = "Castro";
        System.out.println(nombre.getClass().getSimpleName());
        System.out.println(((Object)num).getClass().getSimpleName());
        System.out.println(((Object)num2).getClass().getSimpleName());


    }
}
