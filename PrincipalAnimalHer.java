

public class PrincipalAnimalHer {
    //poliformismo
    public static void main(String[] args) {
        AnimalHer animal = new AnimalHer();
        AnimalHer perro = new PerroHer();
        AnimalHer gato = new GatoHer();
        animal.sonidoAnimal();
        perro.sonidoAnimal();
        gato.sonidoAnimal();
    }
}
