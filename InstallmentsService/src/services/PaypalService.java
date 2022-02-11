package services;

public class PaypalService implements PaymentService{

	public double interest(double baseValue, int month) {
		return (baseValue * 0.01) * month;
	}

	@Override
	public double payTax(double baseValue) {
		return baseValue * 0.02;
	}

	
	
}
