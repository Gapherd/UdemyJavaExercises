package entities;

public class CurrencyConverter {

	public static final double iof = 0.06;

	public static double convert(double dollarPrice, double dollars) {
		return dollarPrice * dollars + (dollarPrice * dollars) * iof;
	}

}
 