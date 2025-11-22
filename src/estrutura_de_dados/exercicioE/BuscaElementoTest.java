package estrutura_de_dados.exercicioE;

import java.util.Scanner;

public class BuscaElementoTest {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] arrayNumeros = {10, 20, 30, 40, 50};

        BuscaElementos buscaElementos = new BuscaElementos(arrayNumeros);

        System.out.print("Informe um número a ser procurado dentro do array: ");
        int numeroInformado = entrada.nextInt();
        buscaElementos.procurarElemento(numeroInformado);
    }
}
