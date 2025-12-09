package estrutura_de_dados.array.exercicioD;

public class ContagemParImparTest {

    public static void main(String[] args) {

        int[] arrayInteiros = {1, 2, 3, 4, 5, 6};

        ContagemParImpar contagem =  new ContagemParImpar(arrayInteiros);

        contagem.quantosParesImpares();
        contagem.porcentagemParImpar();

    }
}
