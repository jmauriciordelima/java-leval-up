package estrutura_de_dados.exercicioE;

public class BuscaElementos {

    private int[] numeros;

    public BuscaElementos() {
    }

    public BuscaElementos(int[] numeros) {
        this.numeros = numeros;
    }

    public void procurarElemento(int numeroProcurado) {

        boolean encontrado = false;
        int indice;

        for (indice = 0; indice < numeros.length; indice++) {
            if (numeros[indice] == numeroProcurado) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.printf("O número %d foi encontradao no array na posição [%d], no índice [%d]%n", numeroProcurado, indice+1, indice);
        } else {
            System.out.printf("O número %d não foi encontradao no array%n", numeroProcurado);
        }

    }

    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }
}
