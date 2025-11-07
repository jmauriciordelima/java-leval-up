package oop.abstracaoeinterfaces.exercicioB;

public class DispositivosTest {

    public static void main(String[] args) {

        Dispositivo radio = new Radio();
        Dispositivo televisao = new Televisao();

        Dispositivo[] dispositivos = {radio, televisao};
        for (Dispositivo dispositivo : dispositivos) {
            dispositivo.ligar();
            dispositivo.status();
            dispositivo.desligar();
        }

    }
}
