public class Condicional {
    public static void main(String[] args){
        int temperatura = 35;
        if (temperatura >37){
            System.out.println("Temperatura alta");
        }else{
            System.out.println("Temperatura ok");
        }

        // if corto, tambien conocido como operador ternario ?:
        String mensaje = temperatura>37?"Temp alta":"Temp baja";
        System.out.println(mensaje);

        if (temperatura >37){
            System.out.println("Temperatura alta");
        }else if(temperatura>=36 && temperatura<=37){
            System.out.println("Temperatura ok");
        }else{
            System.out.println("Temperatura baja");
        }

    }
    
}
