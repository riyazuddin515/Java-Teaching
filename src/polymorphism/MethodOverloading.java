package polymorphism;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(add(10, 40));
        System.out.println(add(10, 40, 60));
        add(10.2, 5.6);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static double add(double a, double b) {
        return a + b;
    }
}
