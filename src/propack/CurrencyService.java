package propack;

public class CurrencyService {
    CurrencyConverter converter = new CurrencyConverter() {
        public double convertToUSD(double amountInINR) {
            double rate = 89.3;
            return amountInINR / rate;
        }
    };

    public void showConversion() {
        double usd = converter.convertToUSD(20000);
        System.out.printf("INR ₹20000 To USD $%.2f\n", usd);
    }
}

