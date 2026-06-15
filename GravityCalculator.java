public class gravityCalculator {
    public static double distanceAfterTime(double t, double v1) {
        double a = 9.8;
        double distance = 0.5 * a * t * t + v1 * t;
        return distance;
    }
    public static void main(String[] args) {
        double t = 2; // set time of the free fall unit seconds
        double v1 = 0; // set inital speed of the free fall unit meters per second

        System.out.println(distanceAfterTime(t, v1));
    }
}
