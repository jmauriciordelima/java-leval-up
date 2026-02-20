package estrutura_de_dados.arraylist_e_linkedlist.exercicioD;

import java.util.ArrayList;
import java.util.Scanner;

public class TamanhoPalavra {

    private ArrayList<String> listaDeNomes = new ArrayList<>();
    private boolean validarOpcao = true;
    private String nomeRemovidoPorIndice;
    private int lerInteiro;
    private Scanner entrada = new Scanner(System.in);

    public TamanhoPalavra() {
        this.listaDeNomes = new ArrayList<>();
    }


    public void menu() {
        String menu = "---- Escolha uma das opções ----" +
                "\n1 - adicionar" +
                "\n2 - remover" +
                "\n3 - listar" +
                "\n4 - Busca por nome" +
                "\n5 - sair" +
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
                    buscarNomes();
                    break;

                case "5":
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
        if (verificarListaPorNome(entradaUsuarioParaAdicionar)) {
            System.out.println(entradaUsuarioParaAdicionar + " já existe.");
            return;
        }
        listaDeNomes.add(entradaUsuarioParaAdicionar);
    }

    private void remover() {

        int entradaUsuarioParaRemocao = -1;
        int antesDaRemocao = listaDeNomes.size();

        if (verificaLista()) {
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

        String opcao = "";
        boolean opcaoValida = false;

        do {

            if (verificaLista()) {
                return;
            } else {

                System.out.println("Digite [1] para Nomes maiores que 5 letras" +
                        "\nDigite [2] para Nomes menores que 5 letras" +
                        "\nDigite [3] para Voltar ao Menu inicial.");
            }
            try {
                opcao = String.valueOf(Integer.parseInt(entrada.nextLine()));
            } catch (NumberFormatException e) {
                throw new RuntimeException(e);
            }

            switch (opcao) {

                case "1":
                    listaDeNomesMaiorQueCinco();
                    opcaoValida = true;
                    break;
                case "2":
                    listaDeNomesMenorQueCinco();
                    opcaoValida = true;
                    break;
                case "3":
                    return;

                default:
                    System.out.println("Opção inválida... Digite uma das opções válida.");
                    break;
            }

        } while (opcaoValida);


    }

    private void buscarNomes() {

        if (verificaLista()) {
            return;
        }

        System.out.println("Digite o nome do qual deseja buscar: ");
        String nome = entrada.nextLine().toUpperCase();

        int indice = listaDeNomes.indexOf(nome);

        if (indice != -1) {
            System.out.println("\n[" + nome + "] - ENCONTRADO NA POSIÇÃO " + (indice + 1));
        } else {
            System.out.println("\n[" + nome + "] - não encontrado.");
        }
    }

    private int tamanoLista() {

        verificaLista();

        return listaDeNomes.size();
    }

    private void listaDeNomesMaiorQueCinco() {

        if (tamanoLista() > 0) {
            System.out.println("\n---- Lista de nomes ----");

            for (int i = 0; i < listaDeNomes.size(); i++) {

                if (listaDeNomes.get(i).length() > 4) {

                    System.out.println((i + 1) + " - " + listaDeNomes.get(i) + "[" + listaDeNomes.get(i).length() + "]");

                }

            }
            System.out.println("\nQuantidade de nomes cadastrados: " + listaDeNomes.size());
        }
        System.out.println("\n------------------------\n");

    }

    private void listaDeNomesMenorQueCinco() {

        if (tamanoLista() > 0) {
            System.out.println("\n---- Lista de nomes ----");

            for (int i = 0; i < listaDeNomes.size(); i++) {

                if (listaDeNomes.get(i).length() < 5) {

                    System.out.println((i + 1) + " - " + listaDeNomes.get(i) + "[" + listaDeNomes.get(i).length() + "]");

                }

            }
            System.out.println("\nQuantidade de nomes cadastrados: " + listaDeNomes.size());
        }
        System.out.println("\n------------------------\n");
    }

    private boolean verificaLista() {

        boolean empty = listaDeNomes.isEmpty();

        if (empty) {
            System.out.println("\n*** LISTA VAZIA ***\n");
        }

        return empty;
    }

}