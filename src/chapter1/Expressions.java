package chapter1;

public class Expressions {

    // Methods for the 1.1.1
    public static int a(int a, int b, int c) {
        return (a + b) / c;
    }

    public static double b(double a, double b) {
        return a * b;
    }

    public static boolean c(boolean a, boolean b) {
        return a && b;
    }

    // Methods for the 1.1.2
    public static double aa(int a, double b) {
        return (a + b);
    }

    public static double bb(int a, int b, int c, double d) {
        return (a + b + c + d);
    }

    public static boolean cc(double a, double b) {
        if (a >= b) {
            System.out.println(true);
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        // 1.1.1  Give the value of the following expressions
        /*
        * a- (0 + 15) / 2
        * b- 2.0e-6 * 100000000.1
        * c- true && false || true && true
        *
        * */

        // 1.1.2 Give the type and value of each of the following expressions
        /*
        * a- (1 + 2.236) / 2
        * b- 1 + 2 + 3 + 4.0
        * c- 4.1 >= 4
        * d- 1 + 2 + "3"
        * */

        // 1.1.1
        System.out.println("Result for a is: " + a(0, 15, 2));
        System.out.println("Result for b is: " + b(2.0e-6, 100000000.1));
        System.out.println("Result for c is: " + c(true, false));

        // 1.1.2
        System.out.println(aa(10, 23.32));
        System.out.println(bb(1, 2, 3, 4.0));
        cc(4.1, 4);
    }
}