public class StringDemo {
    public static void main(String[] args) {
        String asf = "This is a java class.";
        System.out.println(asf);

        asf = asf + ".";
        System.out.println(asf);

        StringBuilder sb = new StringBuilder("This is a class");
        sb.append("Hello");
        System.out.println(sb.toString());
    }
}
