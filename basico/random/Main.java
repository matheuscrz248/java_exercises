package random;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        int n1;
        boolean isHead;

        n1 = random.nextInt(1,10);
        isHead = random.nextBoolean();

        System.out.println("Número aleatório: " + n1);

        if (isHead) {
            System.out.println("Cara");
        }
        else {
            System.out.println("Coroa");
        }

    }
}
