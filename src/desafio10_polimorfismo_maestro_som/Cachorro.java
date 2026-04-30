package desafio10_polimorfismo_maestro_som;

public class Cachorro extends Animal{
    @Override
    public void emitirSom(){
        System.out.println("Au, au!");
    }
}
