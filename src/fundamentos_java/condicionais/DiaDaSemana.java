package fundamentos_java.condicionais;

import java.util.Scanner;

public class DiaDaSemana {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int dayOfWeek;

        do {
            System.out.print("Informe o dia da semana: ");
            dayOfWeek = scanner.nextInt();

            switch (dayOfWeek) {

                case 1:
                    System.out.println("Domingo");
                    break;
                case 2:
                    System.out.println("Segunda-feira");
                    break;
                case 3:
                    System.out.println("Terça-feira");
                    break;
                case 4:
                    System.out.println("Quarta-feira");
                    break;
                case 5:
                    System.out.println("Quinta-feira");
                    break;
                case 6:
                    System.out.println("Sexta-feira");
                    break;
                case 7:
                    System.out.println("Sábado");
                    break;
                default:
                    System.out.println("Valor inválido. Digite um número de 1 a 7.");
                    break;
            }

        } while (dayOfWeek < 1 || dayOfWeek > 7);

        scanner.close();

    }
}
