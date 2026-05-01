package conditions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        int idade;

        System.out.print("Digite seu nome: ");
        nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        idade = scanner.nextInt();

        if (idade < 0) {
            System.out.println(nome + ", você não nasceu!");
        } else if (idade == 0) {
            System.out.println(nome + ", você é um bebê!");
        } else if (idade < 12) {
            System.out.println(nome + ", você é uma criança!");
        } else if (idade < 18) {
            System.out.println(nome + ", você é um(a) adolescente!");
        } else if (idade < 65) {
            System.out.println(nome + ", você é um(a) adulto(a)!");
        } else {
            System.out.println("Você é um(a) idoso(a)!");
        }
    }
}
