package seminar2HW;

public class FirstTask {
        public static double myPow(double x, int n) {
            if (n == 0) return 1.0;
            else if (n % 2 == 1) return x * myPow(x, n - 1);
            else if (n % 2 == 0) return myPow(x * x, n / 2);
            else return 1 / myPow(x, -n);
    }
    public static void main(String[] args) {
        System.out.println(myPow(2.00000, 10));
        System.out.println(myPow(2.10000, 3));
        System.out.println(myPow(2.00000, -2));
    }
}
