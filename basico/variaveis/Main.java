package variaveis;

public class Main {
    public static void main(String[] args) {

        String name = "Matheus";
        int idade = 22;
        char gender = 'M';
        String moeda = "R$";
        double saldo = 900.55;
        double height = 1.64;
        boolean isStudant = true;

        System.out.println("Nome: " + name);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + height);
        System.out.println("Gênero: " + gender);

        if (isStudant){
            System.out.println("Estudante");
        }
        else {
            System.out.println("Não é estudante");
        }

        System.out.println("Saldo: " + moeda + " " + saldo);

    }
}
