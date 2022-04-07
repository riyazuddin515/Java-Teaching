package inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        Dog d = new Dog("Rocky", 1, 1, 5, 58, 1, 4, 2);
        String n = d.getName();
        System.out.println(n);
        d.eat();

        Animal ani = new Animal("Loin", 1, 1, 7, 60);
        ani.eat();
    }
}
