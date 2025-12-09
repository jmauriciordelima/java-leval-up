package estrutura_de_dados.array.exercicioCextra;

public class NomesInversosTest {

    public static void main(String[] args) {

        String[] nomes = {"Ana", "Bruno", "Carla", "Diego", "Eva"};

        NomesInversos nomesInversos = new NomesInversos(nomes);

        nomesInversos.exibirNomesInversos();

        nomesInversos.adicionarNomes();
    }
}
