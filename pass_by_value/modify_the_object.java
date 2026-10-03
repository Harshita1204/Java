class Student {
    String name;
}

public class Main {

    static void change(Student s) {
        s.name = "Aman";
    }

    public static void main(String[] args) {

        Student student = new Student();

        student.name = "Rupinder";

        change(student);

        System.out.println(student.name);
    }
}