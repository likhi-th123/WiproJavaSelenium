package propack;

public class BankingSystem {
    public static void main(String[] args) {

        // Anonymous class for InterestCalculator
        InterestCalculator interestCalculator = new InterestCalculator() {
            public double calculateInterest(double principal, double rate, double time) {
                return (principal * rate * time) / 100;
            }
        };
        double interest = interestCalculator.calculateInterest(20000, 5.5, 3);
        System.out.println("Simple Interest: ₹" + interest);

        // Anonymous class for EMICalculator
        EMICalculator emiCalculator = new EMICalculator() {
            public double calculateEMI(double principal, double annualRate, int months) {
                double monthlyRate = annualRate / (12 * 100);
                return (principal * monthlyRate * Math.pow(1 + monthlyRate, months)) /
                       (Math.pow(1 + monthlyRate, months) - 1);
            }
        };
        double emi = emiCalculator.calculateEMI(300000, 7.5, 48);
        System.out.printf("Monthly EMI: ₹%.2f\n", emi);

        // Anonymous class for CurrencyConverter
        CurrencyConverter converter = new CurrencyConverter() {
            public double convertToUSD(double amountInINR) {
                double usdRate = 83.0;  // Example: 1 USD = ₹83
                return amountInINR / usdRate;
            }
        };
        double usdAmount = converter.convertToUSD(10000);
        System.out.printf("INR ₹10000 = USD $%.2f\n", usdAmount);
    }
}

