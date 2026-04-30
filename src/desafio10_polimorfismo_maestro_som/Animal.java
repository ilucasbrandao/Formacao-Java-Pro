package desafio10_polimorfismo_maestro_som;
/*
☕ Desafio 10: O Maestro dos Sons (Polimorfismo Avançado)
Agora vamos para o último pilar clássico da POO: o Polimorfismo.
O objetivo aqui é aprender que você pode tratar objetos diferentes de forma genérica, mas cada um manterá sua identidade única.

📝 Enunciado:

Crie uma classe base chamada Animal.
Ela deve ter um metodo emitirSom(), que imprime: "O animal emite um som".
Crie duas subclasses: Cachorro e Gato.
Sobrescreva o metodo emitirSom() em cada uma:
No Cachorro, deve imprimir: "Au Au!"
No Gato, deve imprimir: "Miau!"
O Grande Teste: No seu main, crie uma Lista (ArrayList<Animal>) ou um Array (Animal[]).
Adicione um objeto Cachorro e um Gato nesta lista de Animais.
Use um laço for (ou for-each) para percorrer a lista e chamar o metodo emitirSom() de cada um.
*/

public class Animal {
    public void emitirSom(){
        System.out.println("Som do animal");
    }
}
