public class Excepciones2 {
    public static void main(String[] args) {
        try{
            prueba();
        }
        catch(IllegalAccessException e){
            System.out.println("Capturada la excepcion");
            System.out.println(e.getMessage());
        }
        
    }
    public static void prueba() throws IllegalAccessException{
        System.out.println("Excepión del método prueba");
        throw new IllegalAccessException("prueba");
    }
}
