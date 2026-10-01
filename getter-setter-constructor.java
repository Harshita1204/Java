class Student {

    private String name;
    private int marks;

    // Constructor
    public Student(String name, int marks) {
        this.name = name;
        setMarks(marks);
    }

    // Setter
    public void setMarks(int marks) {   // this will set it already
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks!");
        }
    }

    // Getter -> to get the marks from the user
    public int getMarks() {
        return marks;
    }

    // Getter -> to get name from user
    public String getName() {
        return name;
    }
}


public class Main {

    public static void main(String[] args) {

        Student s1 = new Student("Riya", 85);

        System.out.println("Name: " + s1.getName());
        System.out.println("Marks: " + s1.getMarks());

        s1.setMarks(95);

        System.out.println("Updated Marks: " + s1.getMarks());
    }
}