package class_and_objects;

public class Counter {
    static int count;
    Counter(){
        count++;
        System.out.println(count);
    }
}

class CounterTest{
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
    }
}
