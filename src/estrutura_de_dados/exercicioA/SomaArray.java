package estrutura_de_dados.exercicioA;

public class SomaArray {

    private int[] numeros;

    public SomaArray() {
    }

    public SomaArray(int[] soma) {
        this.numeros = soma;
    }

    private int realizarSoma() {
        int somatorio = 0;

        for (int i = 0; i < numeros.length; i++) {
            somatorio += numeros[i];
        }

        return somatorio;

    }

    public void exibirSoma() {
        int somatorio = realizarSoma();

        System.out.println("O somatório do array é = " + somatorio);

    }


    public void exibirMedia() {
        double media = (double) realizarSoma() / getNumeros().length;

        System.out.println("A média do array é de: " + media);

    }

    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }

}
