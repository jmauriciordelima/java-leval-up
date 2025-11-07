package oop.abstracaoeinterfaces.exercicioA;

public class AnimalTest {

    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();
        cachorro.nome = "Peper";
        cachorro.apresentar();
        cachorro.emitirsom();

        Gato gato = new Gato();
        gato.nome = "Alaô";
        gato.apresentar();
        gato.emitirsom();

    }
}
