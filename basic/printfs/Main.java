package printfs;

public class Main {
    public static void main(String[] args) {

        int n1 = 1;
        int n2 = 23;
        int n3 = 456;
        int n4 = 7890;

        /* Formatação:
        "%d" para números inteiros (int, long)
        "%f" para números decimais (float, double)
        "%s" para texto (String)
        "%c" para caractere (char)
        "%b" para boolean (0, 1)
         */

        // "%4d" imprime a formatação com quatro dígitos (preenche com espaços à esquerda caso não tenha dígitos suficientes)

        System.out.printf("%4d\n", n1);
        System.out.printf("%4d\n", n2);
        System.out.printf("%4d\n", n3);
        System.out.printf("%4d\n\n", n4);

        // "%04d" imprime a formatação com quatro dígitos (preenche com zeros à esquerda caso não tenha dígitos suficientes)

        System.out.printf("%04d\n", n1);
        System.out.printf("%04d\n", n2);
        System.out.printf("%04d\n", n3);
        System.out.printf("%04d\n\n", n4);

        // "%-4d" preenche à direita (inverte)

        System.out.printf("%-4d\n", n1);
        System.out.printf("%-4d\n", n2);
        System.out.printf("%-4d\n", n3);
        System.out.printf("%-4d\n\n", n4);

    }
}
