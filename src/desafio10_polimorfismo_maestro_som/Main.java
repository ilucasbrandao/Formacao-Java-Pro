package desafio10_polimorfismo_maestro_som;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        Animal animals[] = {cachorro,gato};

        for (Animal a : animals) {
            a.emitirSom();
        }
    }
}
