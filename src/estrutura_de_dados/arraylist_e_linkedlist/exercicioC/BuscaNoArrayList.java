package estrutura_de_dados.arraylist_e_linkedlist.exercicioC;

import java.util.ArrayList;
import java.util.Scanner;

public class BuscaNoArrayList {

    private ArrayList<String> listaDeNomes = new ArrayList<>();
    private boolean validarOpcao = true;
    private String pesquisaPorIndice;
    private int lerInteiro;
    private int posicaoDaLista;
    private Scanner entrada = new Scanner(System.in);

    public BuscaNoArrayList() {

    }

    public BuscaNoArrayList(ArrayList<String> nomes) {
        this.listaDeNomes = nomes;
    }


    public void menu() {
        String menu = "---- Escolha uma das opções ----" +
                "\n1 - adicionar" +
                "\n2 - pesquisar" +
                "\n3 - listar" +
                "\n4 - sair" +
                "\n";

        do {

            System.out.print(menu +
                    "\n-> ");

            String entradaUsuarioMenu = entrada.nextLine().toUpperCase();

            switch (entradaUsuarioMenu) {

                case "1":
                    adicionar();
                    break;

                case "2":
                    pesquisar();
                    break;

                case "3":
                    listaDeNomesAdicionados();
                    break;

                case "4":
                    System.out.println("Finalizando...");
                    validarOpcao = false;
                    break;

                default:
                    System.out.println("\nOpção inválida\n");
            }


        } while (validarOpcao);
    }

    private void adicionar() {

        System.out.print("Adicionar -> ");
        String entradaUsuarioParaAdicionar = entrada.nextLine().toUpperCase();
        listaDeNomes.add(entradaUsuarioParaAdicionar);
    }

    private void pesquisar() {

        int entradaUsuarioParaPesquisarPorIndice = -1;

        if (listaDeNomes.isEmpty()) {
            System.out.println("Lista vazia.\n");
            return;

        } else {
            System.out.print("Buscar por NOME ou por NÚMERO?\n" +
                    "\n1 - NOME" +
                    "\n2 - NÚMERO" +
                    "\n -> ");

            try {
                lerInteiro = Integer.parseInt(entrada.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Erro: Você digitou um número inválido!");
                return;
            }
        }

        entradaUsuarioParaPesquisarPorIndice = lerInteiro;

        switch (entradaUsuarioParaPesquisarPorIndice) {

            case 1:
                System.out.print("Pesquisar -> ");
                String usuarioParaPesquisar = entrada.nextLine().toUpperCase();

                verificarListaPorNome(usuarioParaPesquisar);

                break;

            case 2:
                System.out.print("Pesquisar -> ");


                try {
                    lerInteiro = Integer.parseInt(entrada.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Erro: Você digitou um número inválido!");
                    return;
                }

                posicaoDaLista = lerInteiro;

                verificarListaPorIndice(posicaoDaLista);

                break;

        }

    }

    private void verificarListaPorNome(String pesquisaNome) {

        if (listaDeNomes.contains(pesquisaNome)) {

            for (int i = 0; i < listaDeNomes.size(); i++) {
                if (pesquisaNome.equals(listaDeNomes.get(i))) {
                    System.out.println((i + 1) + " - " + " " + listaDeNomes.get(i));
                }
            }

        } else {
            System.out.println("[" + pesquisaNome + "] não encontrado.\n");
        }

    }


    private void verificarListaPorIndice(int posicaoInformada) {

        int indiceReal = --posicaoInformada;

        if (indiceReal >= 0 && indiceReal < listaDeNomes.size()) {
            pesquisaPorIndice = listaDeNomes.get(indiceReal);
            System.out.println(pesquisaPorIndice);
        } else {
            System.out.println("Posição: [" + posicaoDaLista + "] não encontrado\n");
        }

    }


    private void listaDeNomesAdicionados() {

        if (tamanoLista() > 0) {
            System.out.println("\n---- Lista de nomes ----");
            for (int i = 0; i < listaDeNomes.size(); i++) {
                System.out.println((i + 1) + " - " + listaDeNomes.get(i));
            }
            System.out.println("\nQuantidade de nomes cadastrados: " + listaDeNomes.size());
        }
        System.out.println("\n------------------------\n");

    }


    private int tamanoLista() {
        if (listaDeNomes.isEmpty()) {
            System.out.println("\n*** LISTA VAZIA ***\n");
        }
        return listaDeNomes.size();
    }

    public void setListaDeNomes(ArrayList<String> listaDeNomes) {
        this.listaDeNomes = listaDeNomes;
    }
}
