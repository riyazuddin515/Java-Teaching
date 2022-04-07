package inheritance;

public class Dog extends Animal{

    private int tail;
    private int legs;
    private int eyes;

    public Dog(String name, int brain, int body, int size, int weight, int tail, int legs, int eyes) {
        super(name, brain, body, size, weight);
        this.tail = tail;
        this.eyes = eyes;
        this.legs = legs;
    }

    // Overriding
    @Override
    public void eat() {
        super.eat();
        chew();
    }

    public void chew() {
        System.out.println(super.getName() + " is eating");
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }
}
