package scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nome;
        int idade;
        String genero;
        double altura;
        String profissao;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        nome = scanner.nextLine();

        // Método numérico do Scanner não consome o ENTER, somente "scanner.nextLine();" ou "scanner.nextLine();".
        System.out.print("Digite a idade: ");
        idade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o gênero: ");
        genero = scanner.nextLine();

        /* O Scanner pode aceitar só vírgula ou ponto. Para isso, recebi a altura como String,
        substituí a vírgula por ponto e depois converti a String para double, armazenando o resultado
        na variável altura.
        */
        System.out.print("Digite a altura: ");
        String entrada = scanner.nextLine();
        entrada = entrada.replace(",", ".");
        altura = Double.parseDouble(entrada);

        System.out.print("Digite a profissão: ");
        profissao = scanner.nextLine();
        System.out.println();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Gênero: " + genero);
        System.out.printf("Altura: %.2f\n", altura);
        System.out.println("Profissão: " + profissao);

        scanner.close();
    }
}
