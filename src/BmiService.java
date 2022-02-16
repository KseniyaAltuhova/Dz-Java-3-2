public class BmiService {
    public float calculate(float hight, float mass) {
        float  bmi = mass * 10_000 / (hight * hight);
        return bmi;
    }
}
