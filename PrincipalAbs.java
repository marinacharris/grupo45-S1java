public class PrincipalAbs {
    public static void main(String[] args) {
        //AnimalAbs obj1 = new AnimalAbs(); esto no se puede porque AnimalAbs es una clase abstracta
        GatoAbs obj1 = new GatoAbs(); 
        obj1.dormir();
        obj1.sonidoAnimal();
    }
}
