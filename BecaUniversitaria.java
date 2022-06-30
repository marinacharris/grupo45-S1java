public class BecaUniversitaria {
    // Atributos
    private int pTiempo;
    private double pMonto;
    private double pInteres;
    //método constructor
    public BecaUniversitaria(){
        this.pTiempo = 0;
        this.pMonto = 0;    
        this.pInteres = 0;  
    }
    public BecaUniversitaria(int pTiempo, double pMonto, double pInteres){
        this.pTiempo = pTiempo;
        this.pMonto = pMonto;   
        this.pInteres = pInteres; 
    }
    // métodos
    public double calcularInteresSimple(){
        double intSimple = pMonto * (pInteres/100) * pTiempo;
        return Math.round(intSimple); 
    }
    public double calcularInteresCompuesto(){
        double intCompuesto = pMonto * (Math.pow(1+pInteres/100,pTiempo)-1);
        return Math.round(intCompuesto);
    }

    public String compararInversion(){
        double diferencia = calcularInteresCompuesto()-calcularInteresSimple();
        if (diferencia == 0){
            return "No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.";
        }else{
            return "La diferencia entre la proyección de interés compuesto e interés simple es: $" +diferencia;
        }
    }

    public String compararInversion(int pTiempo, double pMonto, double pInteres){
        this.pTiempo = pTiempo;
        this.pMonto = pMonto;   
        this.pInteres = pInteres; 
        double diferencia = calcularInteresCompuesto()-calcularInteresSimple();
        if (diferencia == 0){
            return "No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.";
        }else{
            return "La diferencia entre la proyección de interés compuesto e interés simple es: $" +diferencia;
        }
    }

    //main
    public static void main(String[] args) {
        BecaUniversitaria becaUniversitaria = new BecaUniversitaria(); 
        System.out.println(becaUniversitaria.calcularInteresSimple()); 
        System.out.println(becaUniversitaria.calcularInteresCompuesto()); 
        System.out.println(becaUniversitaria.compararInversion(60,13000,1.4)); 

    }
}
