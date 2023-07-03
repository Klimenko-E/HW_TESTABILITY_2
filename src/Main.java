public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double weightKg = 98;
        double heightMeter = 1.87;
        double BMI = service.calculate(weightKg, heightMeter);
        System.out.println((int) BMI);
        System.out.println();

        weightKg = 120;
        heightMeter = 1.65;
        BMI = service.calculate(weightKg, heightMeter);
        System.out.println((int) BMI);

    }
}