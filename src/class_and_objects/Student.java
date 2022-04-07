package class_and_objects;

import java.util.Scanner;

class Student {
    String name;
    int id;
    String course;
    int attendence;
    static String collegeName = "ABC";

    Student(String name, int id, String course) {
        this.name = name;
        this.id = id;
        this.course = course;
        this.attendence = 0;
        collegeName = "ABC";
    }

    public void run(){
        System.out.println("Iam Running");
    }

    public void attend() {
        System.out.println("I am attending the class");
        attendence = attendence + 1;
    }

    public static void whatIsTheCollegeName() {
        System.out.println(collegeName);
    }
}

class Temp{
    public static void main(String[] args) {

        Student.whatIsTheCollegeName();
        Student.collegeName = "XYZ";
        System.out.println(Student.collegeName);

        Student obj = new Student("ojjd", 531, "jdjle");
        obj.run();
        obj.attend();
        System.out.println(obj.attendence);

        obj.attend();
        System.out.println(obj.attendence);

        obj.attend();
        System.out.println(obj.attendence);

        obj.attend();
        System.out.println(obj.attendence);

        obj.attend();
        System.out.println(obj.attendence);

        obj.attend();
        System.out.println(obj.attendence);

    }
}