package polymorphism;

public class RunTimePolymorphism {
    public static void main(String[] args) {
        Movie eg = new EndGame("EndGame");
        eg.spoiler();

        Movie iw = new InfinityWar("IW");
        iw.spoiler();
    }
}
