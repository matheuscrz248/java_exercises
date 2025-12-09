package classMath;

public class Main {
    public static void main(String[] args) {

        double result;

        result = Math.pow(2, 3);
        System.out.println("2 elevado a 3: " + result);

        result = Math.abs(-10);
        System.out.println("Valor absoluto de -10: " + result);

        result = Math.sqrt(9);
        System.out.println("Raiz quadrada de 9: " + result);

        result = Math.round(Math.PI);
        System.out.println("Valor arredondado de pi: " + result);

        result = Math.ceil(Math.PI);
        System.out.println("Valor arredondado de pi para cima: " + result);

        result = Math.floor(5.9);
        System.out.println("Valor arredondado de 5.9 para baixo: " + result);

        result = Math.max(10, 50);
        System.out.println("Valor máximo entre 10 e 50: " + result);

        result = Math.min(10, 50);
        System.out.println("Valor mínimo entre 10 e 50: " + result);


    }
}
