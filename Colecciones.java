import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.LinkedList;
public class Colecciones {
   
    public static void main(String[] args) {
         // ArrayList
         ArrayList<String> lista1 = new ArrayList<String>();
         lista1.add("Barranquilla"); // método add sirve para añadir un elemento
         lista1.add("Cali");
         lista1.add("Bogota");
         lista1.add("Bucaramanga");
         lista1.add(1,"Santa Marta");
         
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
         lista1.remove(0); //método remosve elimina el elemento de la posición dada.
         System.out.println(lista1);

         //linkedList
         System.out.println("----------------------");
         LinkedList<String> linkedList = new LinkedList<String>();
         linkedList.add("Juan");
         linkedList.add("Pedro");
         linkedList.add("Ana");
         System.out.println(linkedList);
         linkedList.add(1,"María");
         System.out.println(linkedList);
         // addFirst, addLast, removeFirst, removeLast, getFirst, getLast son método de los linkedList
         linkedList.addFirst("Andrés");
         if (linkedList.contains("María")){ //permite buscar un elemento y devuelve true si lo encuentra
            System.out.println("Si está");
         }
        System.out.println("---------------------------");
         //HashMap
        Map<String,String> map1 = new HashMap<String,String>();
        map1.put("green","verde");
        map1.put("red", "rojo");
        map1.put("blue", "azul");
        map1.put("yellow", "amarillo");
        for(String i: map1.keySet()){
            System.out.println(i); //imprime las llaves
        }
        for (String i: map1.values()){
            System.out.println(i); //imprime los valores
        }
        for(String i: map1.keySet()){
            System.out.println(i +" es español es: "+ map1.get(i));
        }

        //hashMap con objeto carro
        Map<CarroColecciones, String> map2 = new HashMap<CarroColecciones, String>();
        map2.put(new CarroColecciones("Mazda"), "Plateado");
        map2.put(new CarroColecciones("Audi"), "Blanco");   
        map2.put(new CarroColecciones("Nissan"), "Rojo");
        for (CarroColecciones i: map2.keySet()){
            System.out.println("El "+ i.getMarca()+ " es de color " + map2.get(i));
        }
        //hashSet
        HashSet<Integer> conjunto1 = new HashSet<Integer>();
        conjunto1.add(23);
        conjunto1.add(65);
        conjunto1.add(48);
        conjunto1.add(35);
        conjunto1.add(29);
        conjunto1.add(65);
        System.out.println(conjunto1.size());
        System.out.println(conjunto1);






         




    }

}
