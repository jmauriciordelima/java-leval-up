package fundamentos_java.estruturaderepeticao.estruturawhile;

public class ContadorRegressivo {

    private int contador;

    public ContadorRegressivo(int contador) {
        this.contador = contador;
    }

    public void iniciarContagem() {
        if (contador < 0) {
            System.out.println("O número deve ser positivo e maior que zero.");
        } else {
            while (contador > 0) {
                System.out.println(contador);
                contador--;
            }
            System.out.println("Fim da contagem!");
        }

    }
}
