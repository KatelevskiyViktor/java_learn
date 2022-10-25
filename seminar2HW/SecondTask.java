package seminar2HW;

public class SecondTask {
    public static boolean isPowerOfTwo(int n) {
        if(n == 1){
            return true;
        } 
        if(n % 2 == 1 || n == 0){
            return false;
        }
        return isPowerOfTwo(n/2);
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(1));
        System.out.println(isPowerOfTwo(16));
        System.out.println(isPowerOfTwo(3));
    }
}