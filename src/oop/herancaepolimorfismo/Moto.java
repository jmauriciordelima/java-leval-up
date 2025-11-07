package oop.herancaepolimorfismo;

public class Moto extends Veiculo{

    public String cor;
    public int cilindrada;

    public Moto(String marca, String modelo, String cor, int cilindrada) {
        super(marca, modelo);
        this.cor = cor;
        this.cilindrada = cilindrada;
    }

    @Override
    public void ligar() {
        System.out.println("A moto está ligando!");
    }

    @Override
    public void informacoesVeiculo() {
        System.out.println("A moto é da Fabricante: " + marca +
                "\ne de Modelo: " + modelo +
                "\nde cor: " + cor +
                "\nCilindradas: " + cilindrada);
    }

}
