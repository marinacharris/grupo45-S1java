public class Ciclos {
    public static void main(String[] args){
        //conteo del 1 al 5
        // while
        int count = 1;
        while (count <=5){
            System.out.println(count);
            count++;
        }
        // do while, evalua la condición al fina y asegura que por lo menos se ejecuta el ciclo una vez
        System.out.println("----------------------");
        count = 1;
        do{
            System.out.println(count);
            count++;
        }
        while(count <=5);

    }
}
