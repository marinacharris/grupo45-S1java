import java.util.ArrayList;
public class Colecciones {
   
    public static void main(String[] args) {
         // ArrayList
         ArrayList<String> lista1 = new ArrayList<String>();
         lista1.add("Barranquilla"); // método add sirve para añadir un elemento
         lista1.add("Cali");
         lista1.add("Bogota");
         lista1.add("Bucaramanga");
         System.out.println(lista1);
         for (int i = 0; i < lista1.size(); i++){ // método size devuelve el tamaño del array
            System.out.println(lista1.get(i)); //método get que devuelve el valor de una posición
         }
         for (String i : lista1) {
            System.out.println(i);
         }

         // crear un arrayList de objetos (clase CarroColecciones)
         ArrayList<CarroColecciones> carros = new ArrayList<CarroColecciones>();
         carros.add(new CarroColecciones("Chevrolet"));
         carros.add(new CarroColecciones("Nissan"));
         carros.add(new CarroColecciones("BMW"));
         for(int i = 0; i < carros.size(); i++) {
            System.out.println(carros.get(i).getMarca());
         }
         for (CarroColecciones i: carros){
            System.out.println(i.getMarca());
         }

         lista1.set(0, "Cartagena"); //método set sirve para modificar un valor del array
         carros.set(0, new CarroColecciones("Renault"));
         System.out.println(lista1);
         for (CarroColecciones i: carros){
            System.out.println(i.getMarca());
         }
         lista1.remove(0);
         System.out.println(lista1);
         




    }

}
