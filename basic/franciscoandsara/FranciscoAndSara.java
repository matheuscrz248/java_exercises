package franciscoandsara;

public class FranciscoAndSara {
    public static void main(String[] args) {

        /* Francisco is 1.50 meters tall and grows 2 cm per year, while Sara is 1.10 meters
        tall and grows 3 cm per year. Create an algorithm that calculates and prints the number
        of years required for Sara to become taller than Francisco. */

        double francisco = 1.50;
        double sara = 1.10;
        int year = 0;

        while (sara <= francisco) {
            sara += 0.03;
            francisco += 0.02;
            year++;
        }

        System.out.printf("%nIt will take %d years for Sara to become taller than Francisco!%n", year);
    }
}
