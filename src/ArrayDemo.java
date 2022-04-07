import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {

        /*
        0 -> phys
        1 -> che
        2 -> bio
        3 -> math
        4 -> com
         */
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[10];
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        int bio = marks[2];

        int[] temp = {1, 2, 3, 89, 200};

    }
}
