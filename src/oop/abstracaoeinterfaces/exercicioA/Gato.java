package oop.abstracaoeinterfaces.exercicioA;

public class Gato extends Animal {

    @Override
    public void emitirsom() {
        System.out.println("Miau!");
    }

    @Override
    public void apresentar() {
        System.out.println("Olá, eu sou um gato chamado " + nome);
    }
}
