public class fooCorperationPay {
    public static double expectedSalary(double workhours) {
        double salary = 8.0;
        double salartOT = 8.0 * 1.5;

        if (workhours < 0 || workhours > 60) {
            System.err.println("invalid input");
            return -1;
        } else if (workhours <= 40){
            return salary * workhours;
        } else {
            return salary * 40 + salartOT * (workhours - 40);
        }

    }
    public static void main(String[] args) {
        
        double workhours = 40.5;

        System.out.println(expectedSalary(workhours));
    }
}