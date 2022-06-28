public class Arrays {
    public static void main(String[] args){
        // declaracion de un array unidimensional
        String[] ciudades = {"Cali","Bogotá","Manizales","Cartagena"};
        int[] numeros = {85,25,14,96,23};
        System.out.println(ciudades[0]);
        System.out.println(ciudades.length);
        // recorrer un array con for
        for(int i=0; i<=3; i++){
            System.out.println(ciudades[i]);
        }
        // recorrer un array con for each
        for(String city: ciudades){
            System.out.println(city);
        }
        for (int num: numeros){
            System.out.println(num);
        }
        // declaración de una array bidimensional
        int[][] matriz1 = {{52,45,100},{25,12,78}};
        // 52   45  100
        // 25   12  78
        //recorrer la matriz con dos for anidados
        System.out.println(matriz1[1][2]);
        for(int i= 0; i<matriz1.length; i++) {
            for(int j= 0; j<matriz1[i].length; j++) {
                System.out.println(matriz1[i][j]);
            }
        }

    }
}
