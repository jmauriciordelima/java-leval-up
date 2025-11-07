package oop.herancaepolimorfismo;

public class Carro extends Veiculo{

    public String cor;
    public int quantidadePortas;

    public Carro(String marca, String modelo, String cor, int quantidadePortas) {
        super(marca, modelo);
        this.cor = cor;
        this.quantidadePortas = quantidadePortas;
    }

    @Override
    public void ligar() {
        System.out.println("O carro está ligando!");
    }

    @Override
    public void informacoesVeiculo() {
        System.out.println("O carro é da Fabricante: " + marca +
                "\ne de Modelo: " + modelo +
                "\nde cor: " + cor +
                "\nquantidade de portas: " + quantidadePortas);
    }
}
