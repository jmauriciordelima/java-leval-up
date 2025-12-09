package estrutura_de_dados.array.exercicioD;

public class ContagemParImpar {

    private int[] numeros;
    private int par;
    private int impar;

    public ContagemParImpar() {
    }

    public ContagemParImpar(int[] numeros) {
        this.numeros = numeros;
    }

    public void quantosParesImpares() {

        par = 0;
        impar = 0;

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }

        System.out.println("Números pares: " + par +
                "\nNumeros impares: " + impar);

    }

    public void porcentagemParImpar() {

        double porcentagemPar = ((double) par / numeros.length) * 100;
        double porcentagemImpar = ((double) impar / numeros.length) * 100;

        System.out.printf("A porcentagem de números pares: %.2f %% %n" +
                "A porcentagem de números impares: %.2f %%", porcentagemPar, porcentagemImpar);
    }

    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }
}
