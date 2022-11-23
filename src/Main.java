public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int mass = 80;
        double height = 1.75;
        double bmi = service.calculate(mass, height);
        System.out.println(bmi);
    }
}