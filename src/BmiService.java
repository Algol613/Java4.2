public class BmiService {
    public float calculate(float heights, float weights) {
        float imtl = weights / (float) Math.pow(heights, 2);
        return (imtl);
    }
}
