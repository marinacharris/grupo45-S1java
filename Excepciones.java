public class Excepciones {
    public static void main(String[] args) {
        try{
            Integer[] numeros = {45,25,14,59,78};
            System.out.println(numeros[1]);
        }
        catch(Exception e){
            System.out.println("Indice fuera de rango");
            System.out.println(e.getMessage());
        }
        finally{ //este bloque se ejecuta sin tener en cuenta lo que pasa en el try-catch
            System.out.println("Esto siempre pasa");
        }
        //throw
        int edad = 25;
        if (edad >18){
            System.out.println("Acceso permitido");
        }else{
            throw new ArithmeticException("Debes ser mayor de edad");
        }
        System.out.println("------------");
     
        

    }
}
