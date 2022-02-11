package services;

import java.util.Calendar;
import java.util.Date;

import entities.Contract;

public class ContractService {
//ATTRIBUTES
	private PaymentService paymentService;

//CONSTRUCTOR
	public ContractService(PaymentService paymentService) {
		this.paymentService = paymentService;
	}
	
//METHODS
	public void processContract(Contract contract, int months) {
		double baseValue = contract.getTotalValue() /months;
		
		for(int i = 0; i < months; i++) {
			double installmentValue = baseValue;
			Date dueDate = addMonths(contract.getDate(), i + 1);
			
			contract.getInstallments()[i].setDueDate(dueDate);
			installmentValue += paymentService.interest(installmentValue, i+1);
			installmentValue += paymentService.payTax(installmentValue);
			contract.getInstallments()[i].setAmount(installmentValue);
		}
	}
	
	private Date addMonths(Date date, int i) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, i);
		return cal.getTime();
	}
}
