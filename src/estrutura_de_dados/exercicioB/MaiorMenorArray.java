package estrutura_de_dados.exercicioB;

public class MaiorMenorArray {

    private int[] numeros;

    public MaiorMenorArray() {
    }

    public MaiorMenorArray(int[] numeros) {
        this.numeros = numeros;
    }

    public void maiorNumero(int[] numeros) {

        int maior = -1;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        System.out.println("O maior número é: " + maior);

    }

    public void menorNumero(int[] numeros) {

        int menor = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("O menor número é: " + menor);

    }

    public void mediaNumero(int[] numeros) {

        double media = -1;
        int soma = 0;

        for (int numero : numeros) {
            soma += numero;
        }

        media = ((double) soma / numeros.length);

        System.out.println("A média do array é de: " + media);

    }

    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }
}
