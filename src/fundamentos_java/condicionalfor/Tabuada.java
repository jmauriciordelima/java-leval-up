package fundamentos_java.condicionalfor;

public class Tabuada {

    public int numero;

    public void calcularTabuada(int numero) {

        for (int i = 1; i <= 10; i++) {

            int multiplicacao = i * numero;
            System.out.println(numero + " x " + i + " = " + multiplicacao);

        }
    }
}
