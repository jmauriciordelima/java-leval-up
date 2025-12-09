package estrutura_de_dados.arraylist_e_linkedlist.exercicioA;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroNomesArrayList {

    private ArrayList<String> nomes = new ArrayList<>();

    public CadastroNomesArrayList() {
    }

    public CadastroNomesArrayList(ArrayList<String> nomes) {
        this.nomes = nomes;
    }

    public void adicionarUsuarios(Scanner entrada) {

        String nome;

        System.out.print("## Insira aqui! ##\n");

        while (true) {

            System.out.print("-> ");
            nome = entrada.nextLine();

            if (nome.equalsIgnoreCase("sair")) {
                break;
            }
            this.nomes.add(nome);
        }

        System.out.println("\n--------- Lista de nomes adicionados ---------\n");

        for (String nomesAdicionados : nomes) {
            System.out.println(nomesAdicionados);
        }

    }

    public ArrayList<String> getNomes() {
        return nomes;
    }

    public void setNomes(ArrayList<String> nomes) {
        this.nomes = nomes;
    }
}
