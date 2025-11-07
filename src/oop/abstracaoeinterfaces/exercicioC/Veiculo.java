package oop.abstracaoeinterfaces.exercicioC;

public abstract class Veiculo {

    String marca;
    String modelo;
    int ano;

    abstract void mover();

    public void exibirInformacoes() {
        System.out.println("-----** Informações do veículo **-----");
        System.out.println("Marca: " + marca +
                "\nModelo: " + modelo +
                "\nAno: " + ano);
    }
}
