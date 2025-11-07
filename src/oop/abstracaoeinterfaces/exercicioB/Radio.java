package oop.abstracaoeinterfaces.exercicioB;

public class Radio implements Dispositivo {
    @Override
    public void ligar() {
        System.out.println("O Rádio está ligando!");
    }

    @Override
    public void desligar() {
        System.out.println("O Rádio está desligando!");
    }

    @Override
    public void status() {
        System.out.println("O rádio está tocando...");
    }
}
