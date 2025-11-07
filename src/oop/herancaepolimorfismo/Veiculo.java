package oop.herancaepolimorfismo;

public class Veiculo {

    public String marca;
    public String modelo;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void ligar() {
        System.out.println("O veículo está ligando!");
    }

    public void informacoesVeiculo() {
        System.out.println("Veículo de Marca: " + marca +
                "\nModelo: " + modelo);
    }
}
