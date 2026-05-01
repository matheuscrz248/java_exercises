package poo.staticmodifier;

public class CurrencyConverter {

    public static double dollarPrice;
    private final double dollarQuantity;

    public CurrencyConverter(double dollarQuantity) {
        this.dollarQuantity = dollarQuantity;
    }

    public double converter() {
        // IOF = 6%
        return dollarPrice * dollarQuantity * 1.06;
    }
}
