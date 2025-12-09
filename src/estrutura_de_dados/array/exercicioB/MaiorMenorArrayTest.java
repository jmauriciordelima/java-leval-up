package estrutura_de_dados.array.exercicioB;

public class MaiorMenorArrayTest {

    public static void main(String[] args) {

        int[] array = {3, 9, 2, 15, 6};

        MaiorMenorArray maiorMenorArray = new MaiorMenorArray();
        maiorMenorArray.setNumeros(array);

        maiorMenorArray.maiorNumero();
        maiorMenorArray.menorNumero();
        maiorMenorArray.mediaNumero();

        
    }
}
