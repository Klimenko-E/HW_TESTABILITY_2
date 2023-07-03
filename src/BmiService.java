public class BmiService {

    public double calculate(double weightKg, double heightMeter) {
        double index = weightKg / heightMeter / heightMeter;

        return index;

    }
}