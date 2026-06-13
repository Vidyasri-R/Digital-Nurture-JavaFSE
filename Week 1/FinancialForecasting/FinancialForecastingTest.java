public class FinancialForecastingTest {
    public static void main(String[] args) {
        double presentValue = 10000.0;
        double growthRate = 0.08;
        int years = 5;
        double futureValue = FinancialForecasting.calculateFutureValue(presentValue, growthRate, years);
        System.out.println("Present Value: " + presentValue);
        System.out.println("Growth Rate: " + (growthRate * 100) + "%");
        System.out.println("Number of Years: " + years);
        System.out.printf("Future Value: %.2f%n", futureValue);
        System.out.println("\n--- Forecasting for different periods ---");
        for (int i = 1; i <= 10; i++) {
            double result = FinancialForecasting.calculateFutureValue(presentValue, growthRate, i);
            System.out.printf("Year %2d: %.2f%n", i, result);
        }
    }
}
