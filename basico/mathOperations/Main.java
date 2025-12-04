package mathOperations;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n1, n2;

        System.out.print("Digite o primeiro número: ");
        n1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        n2 = scanner.nextDouble();

        double result_Add = n1 + n2;
        double result_Sub = n1 - n2;
        double result_Mul = n1 * n2;
        double result_Div = n1 / n2;
        double result_Res = n1 % n2;

        System.out.println("\nA soma de " + n1 + " e " + n2 + " é: " + result_Add);
        System.out.println("A subtração de " + n1 + " por " + n2 + " é: " + result_Sub);
        System.out.println("A multiplicação de " + n1 + " por " + n2 + " é: " + result_Mul);
        System.out.println("A divisão de " + n1 + " por " + n2 + " é: " + result_Div);
        System.out.println("O resto da divisão de " + n1 + " por " + n2 + " é: " + result_Res);

    }
}
