package fundamentos_java.metodos;

public class Aluno {

    private String nome;
    private int idade;
    private double nota1;
    private double nota2;

    public Aluno(String nome, int idade, double nota1, double nota2) {
        this.nome = nome;
        this.idade = idade;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    private double calcularMedia(double nota1, double nota2) {
        double media = (nota1 + nota2) / 2;
        return media;
    }

    public void exibirInformacoes() {
        double media = calcularMedia(nota1, nota2);
        System.out.println("O aluno(a): " + nome);
        System.out.println("de idade: " + idade);
        System.out.println("está com a média de: " + media);

    }
}
