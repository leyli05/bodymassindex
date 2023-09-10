public class BmiService {

  public int calculate (double rost, int ves) {

        int result;
        result = (int) (ves / (rost * rost));
        return result;
    }
}
