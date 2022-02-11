package services;

public interface PaymentService {

	double interest(double baseValue, int month);
	double payTax(double baseValue);
	
}
