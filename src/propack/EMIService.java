package propack;

public class EMIService {
	EMICalculator emiCalculator = new EMICalculator() {
	    public double calculateEMI(double principal, double annualRate, int months) {
	        double totalInterest = (principal*annualRate*months)/(12 * 100);
	        return (principal + totalInterest)/months;
	    }
	};

    public void showEMI() {
        double emi = emiCalculator.calculateEMI(50000, 8, 60);
        System.out.printf("Monthly EMI:"+"₹%2f\n", emi);
    }
}

