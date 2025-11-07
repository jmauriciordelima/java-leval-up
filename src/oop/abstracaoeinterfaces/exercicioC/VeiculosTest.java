package oop.abstracaoeinterfaces.exercicioC;

public class VeiculosTest {

    public static void main(String[] args) {

        CarroEletrico carroEletrico = new CarroEletrico();
        carroEletrico.modelo = "XC40";
        carroEletrico.marca = "Volvo";
        carroEletrico.ano = 2023;
        carroEletrico.mover();
        carroEletrico.exibirInformacoes();

        MotoCombustao motoCombustao = new MotoCombustao();
        motoCombustao.modelo = "MT-09";
        motoCombustao.marca = "Yamaha";
        motoCombustao.ano = 2025;
        motoCombustao.mover();
        motoCombustao.exibirInformacoes();

        CarroEletrico carroEletricoAutonomo = new CarroEletrico();
        carroEletricoAutonomo.modelo = "Model S";
        carroEletricoAutonomo.marca = "Tesla";
        carroEletricoAutonomo.ano = 2024;
        carroEletricoAutonomo.mover();
        carroEletricoAutonomo.exibirInformacoes();
        carroEletricoAutonomo.dirigirSozinho();

    }
}
