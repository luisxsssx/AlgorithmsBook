package chapter1;

public class Expressions {

    // Method for first expression
    public static int a(int a, int b, int c) {
        int result = (a + b) / c;
        return result;
    }

    // Method for second expression
    public static double b(double a, double b) {
        double result = a * b;
        return result;
    }

    // Method for third expression
    public static boolean c(boolean a, boolean b) {
        boolean result = a && b;
        return result;
    }
    
    public static void main(String[] args) {
        // Give the value of the following expressions
        /*
        * a- (0 + 15) / 2
        * b- 2.0e-6 * 100000000.1
        * c- true && false || true && true
        * */

        // First expression
        System.out.println("Result for a is: " + a(0, 15, 2));

        // Second expression
        System.out.println("Result for b is: " + b(2.0e-6, 100000000.1));

        // Third expression
        System.out.println("Result for c is: " + c(true, false));
    }
}