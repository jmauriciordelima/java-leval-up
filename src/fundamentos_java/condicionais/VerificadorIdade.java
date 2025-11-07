package fundamentos_java.condicionais;

import java.util.Scanner;

public class VerificadorIdade {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a idade: ");
        int age = scanner.nextInt();

        System.out.println("Idade: " + age);

        if (age < 18) {
            System.out.println("Você é menor de idade");
        } else if (age < 60) {
            System.out.println("Você é maior de idade");
        } else {
            System.out.println("Você é idoso");
        }

        scanner.close();
    }
}
