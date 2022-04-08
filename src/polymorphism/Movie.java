package polymorphism;

public class Movie {
    private String name;

    Movie(String name) {
        this.name = name;
    }

    public void spoiler() {
        System.out.println("No spoiler");
    }

}
