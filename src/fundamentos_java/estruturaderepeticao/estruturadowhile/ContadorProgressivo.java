package fundamentos_java.estruturaderepeticao.estruturadowhile;

public class ContadorProgressivo {

    private int contador;

    public ContadorProgressivo(int contador) {
        this.contador = contador;
    }

    public void iniciarContagem() {

        System.out.println("Iniciando contagem progressiva...\n");

        do {
            System.out.println(contador);

            contador++;
        } while (contador <= 5);

        System.out.println("Fim da contagem!");
    }
}
