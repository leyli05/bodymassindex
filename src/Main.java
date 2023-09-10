public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double rost_m= 1.87;
        int ves_kg = 98;
        int index = service.calculate(rost_m, ves_kg);
        System.out.println(index);
    }
}