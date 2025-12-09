package estrutura_de_dados.array.exercicioB;

public class MaiorMenorArray {

    private int[] numeros;

    public MaiorMenorArray() {
    }

    public MaiorMenorArray(int[] numeros) {
        this.numeros = numeros;
    }

    public void maiorNumero() {

        int maior = numeros[0];
        int indice = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
                indice = i;
            }
        }

        System.out.println("O maior número é: " + maior +
                " no indice: " + indice);

    }

    public void menorNumero() {

        int menor = numeros[0];
        int indice = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
                indice = i;
            }
        }

        System.out.println("O menor número é: " + menor +
                " no indice: " + indice);
    }

    public void mediaNumero() {

        int soma = 0;

        for (int numero : numeros) {
            soma += numero;
        }

        double media = (double) soma / numeros.length;

        System.out.println("A média do array é de: " + media);

    }

    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }
}
