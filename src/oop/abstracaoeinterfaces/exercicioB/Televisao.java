package oop.abstracaoeinterfaces.exercicioB;

public class Televisao implements Dispositivo {
    @Override
    public void ligar() {
        System.out.println("A televisão está ligando!");
    }

    @Override
    public void desligar() {
        System.out.println("A televisão está desligando!");
    }

    @Override
    public void status() {
        System.out.println("A televisão está mostrando a programação.");
    }
}
