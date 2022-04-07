package class_and_objects;

public class Calculator {
    int a, b;

    Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int add() {
        int c =  a + b;
        return c;
    }

    public void sub(){
        int c = a - b;
        System.out.println("Sub -> " + c);
    }
}

class CalculatorTest{
    public static void main(String[] args) {
       Calculator cal = createCalculator();

    }

    private static Calculator createCalculator() {
        Calculator cal = new Calculator(10, 20);
        return cal;
    }
}
