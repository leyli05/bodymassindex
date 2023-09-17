public class BmiService {

    public int calculate(double height_m, int weight_kg) {

        int result;
        result = (int) (weight_kg / (height_m * height_m));
        return result;
    }
}
