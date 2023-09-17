public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height_m = 1.87;
        int weight_kg = 98;
        int index = service.calculate(height_m, weight_kg);
        System.out.println(index);
    }
}