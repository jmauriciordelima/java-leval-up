package oop.abstracaoeinterfaces.exercicioA;

public class Cachorro extends Animal {

    @Override
    public void emitirsom() {
        System.out.println("Au au!");
    }

    @Override
    public void apresentar() {
        System.out.println("Olá, eu sou um cachorro chamado " + nome);
    }
}
