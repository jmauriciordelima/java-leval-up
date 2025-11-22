package estrutura_de_dados.exercicioCextra;

import java.util.Scanner;

public class NomesInversos {

    String[] nomes;
    int quantosNomes;

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

    public void adicionarNomes() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("\nDigite quantos nomes deseja inserir: ");
        quantosNomes = entrada.nextInt();
        entrada.nextLine();
        nomes = new String[quantosNomes];

        for (int i = 0; i < quantosNomes; i++) {
            System.out.print(i+1 + " : ");
            nomes[i] = entrada.nextLine();
        }

        exibirNomesInversos();
    }

    public String[] getNomes() {
        return nomes;
    }

    public void setNomes(String[] nomes) {
        this.nomes = nomes;
    }
}
