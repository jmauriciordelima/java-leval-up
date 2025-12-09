package estrutura_de_dados.arraylist_e_linkedlist.exercicioA;

import java.util.Scanner;

public class CadastroNomesArrayListTest {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        CadastroNomesArrayList cadastro = new CadastroNomesArrayList();
        cadastro.adicionarUsuarios(entrada);

        entrada.close();

    }
}
