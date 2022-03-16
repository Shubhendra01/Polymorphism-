package Java03;

public class MethodOverload {

    public int multiply(int a, int b) {
        return a * b;
    }

    public int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        MethodOverload obj = new MethodOverload();
        int result1 = obj.multiply(12, 60);
        int result2 = obj.multiply(12, 23, 60);
        System.out.println(result1);
        System.out.println(result2);
    }
}

