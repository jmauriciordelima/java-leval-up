package estrutura_de_dados.exercicioC;

public class NomesInversos {

    String[] nomes;

    public NomesInversos() {
    }

    public NomesInversos(String[] nomes) {
        this.nomes = nomes;
    }

    public void exibirNomesInversos() {
        System.out.println("---- Nomes em ordem inversa ----\n");

        for (int i = nomes.length -1; i >= 0; i--) {
            System.out.println("Indice " + i + ": " + nomes[i]);
        }
    }

    public String[] getNomes() {
        return nomes;
    }

    public void setNomes(String[] nomes) {
        this.nomes = nomes;
    }
}
