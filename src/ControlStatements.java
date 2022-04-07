import java.util.Scanner;

public class ControlStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter some value:");
        int dayNumber = sc.nextInt();
//        if (a != 18){
//            System.out.println("You are an Adult");
//        }else {
//            System.out.println("Not an Adult");
//        }

//        if (age < 13) {
//            System.out.println("Child");
//        }else {
//            if (age >= 13 && age <= 20){
//                System.out.println("Adult");
//            }else {
//                System.out.println("Senior");
//            }
//        }

//        if (age < 13) {
//            System.out.println("Child");
//        }else if(age >= 13 && age <= 20) {
//            System.out.println("Adult");
//        }
//        else {
//            System.out.println("Senior");
//        }

        /*
        if (dayNumber == 1) {
            System.out.println("Monday");
        } else if (dayNumber == 2) {
            System.out.println("Tuesday");
        } else if (dayNumber == 3) {
            System.out.println("Wednesday");
        }
        */


        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Other");
        }


    }
}
