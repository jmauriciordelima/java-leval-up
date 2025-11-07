package oop.herancaepolimorfismo;

public class VeiculoTest {

    public static void main(String[] args) {

        Carro carro = new Carro("Honda", "City", "Branco", 4);
        carro.ligar();
        carro.informacoesVeiculo();

        System.out.println("\n---------------------------------\n");

        Moto moto = new Moto("Yamaha", "Trace", "Azul", 700);
        moto.ligar();
        moto.informacoesVeiculo();

        System.out.println("\n---------------------------------\n");

        Veiculo carro2 = new Carro("Nissan", "Sandero", "Prata", 2);
        carro2.ligar();
        carro2.informacoesVeiculo();

        System.out.println("\n---------------------------------\n");

        Veiculo moto2 = new Moto("Trinph", "Speed", "Vermelho", 350);
        moto2.ligar();
        moto2.informacoesVeiculo();

        System.out.println("\n---------------------------------\n");
    }
}
