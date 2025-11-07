package oop.abstracaoeinterfaces.exercicioC;

public class CarroEletrico extends Veiculo implements Eletrico, Autonomo{
    @Override
    void mover() {
        System.out.println("O carro elétrico está se movendo silenciosamente.");
    }

    @Override
    public void carregarBateria() {
        System.out.println("O " + modelo + " está carregando a baterria!");
    }

    @Override
    public void dirigirSozinho() {
        System.out.println("O " + modelo + " está dirigindo sozinho com tecnologia autônoma!");

    }
}
