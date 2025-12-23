package estrutura_de_dados.arraylist_e_linkedlist.exercicioB;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroNomesArrayList {

    private ArrayList<String> listaDeNomes = new ArrayList<>();
    private boolean validarOpcao = true;
    private String nomeRemovidoPorIndice;
    private int lerInteiro;
    private Scanner entrada = new Scanner(System.in);

    public CadastroNomesArrayList() {

    }

    public CadastroNomesArrayList(ArrayList<String> nomes) {
        this.listaDeNomes = nomes;
    }


    public void menu() {
        String menu = "---- Escolha uma das opções ----" +
                "\n1 - adicionar" +
                "\n2 - remover" +
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
                    remover();
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

    private void remover() {

        int entradaUsuarioParaRemocao = -1;
        int antesDaRemocao = listaDeNomes.size();

        if (listaDeNomes.isEmpty()) {
            System.out.println("Lista vazia.\n");
            return;

        } else {
            System.out.print("Remover por NOME ou por NÚMERO?\n" +
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

        entradaUsuarioParaRemocao = lerInteiro;

        switch (entradaUsuarioParaRemocao) {

            case 1:
                System.out.print("Remover -> ");
                String usuarioParaRemocao = entrada.nextLine().toUpperCase();

                if (verificarListaPorNome(usuarioParaRemocao)) {
                    listaDeNomes.remove(usuarioParaRemocao);
                    System.out.println("Quantidade: " + antesDaRemocao + " antes | " + listaDeNomes.size() + " agora!");
                    System.out.println("Nome: [" + usuarioParaRemocao + "] removido com sucesso!\n");
                } else {
                    System.out.println("Nome: [" + usuarioParaRemocao + "] não encontrado\n");
                }
                break;

            case 2:
                System.out.print("Remover -> ");


                try {
                    lerInteiro = Integer.parseInt(entrada.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Erro: Você digitou um número inválido!");
                    return;
                }
                int posicaoDaLista = lerInteiro;

                if (verificarListaPorIndice(posicaoDaLista)) {
                    System.out.println("Quantidade: " + antesDaRemocao + " antes | " + listaDeNomes.size() + " agora!");
                    System.out.println("Nome: [" + nomeRemovidoPorIndice + "] na posição [" + posicaoDaLista + "]  " + "removido com sucesso!\n");
                } else {
                    System.out.println("Posição: [" + posicaoDaLista + "] não encontrado\n");
                }
                break;

        }

    }

    private boolean verificarListaPorNome(String usuarioParaRemocao) {

        boolean encontrou = listaDeNomes.contains(usuarioParaRemocao);

        return encontrou;
    }

    private boolean verificarListaPorIndice(int posicaoInformada) {

        int indiceReal = --posicaoInformada;

        if (indiceReal >= 0 && indiceReal < listaDeNomes.size()) {
            this.nomeRemovidoPorIndice = listaDeNomes.get(indiceReal);
            remover(indiceReal);
            return true;
        } else {
            System.out.println("Posição não encontrada.");
        }

        return false;
    }

    private void remover(int posicaoInformada) {

        int indiceReal = posicaoInformada;

        listaDeNomes.remove(indiceReal);

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
