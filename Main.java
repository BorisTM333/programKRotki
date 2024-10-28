import java.util.ArrayList;
import java.util.List;

class Student {
    String firstName;
    String lastName;
    int[] grades;

    public Student(String firstName, String lastName, int[] grades) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = grades;
    }

    public void displayInfo() {
        System.out.print("Imię: " + firstName + " " + lastName + ", Oceny: ");
        for (int grade : grades) {
            System.out.print(grade + " ");
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("John", "Negger", new int[]{5, 6, 5}));
        students.add(new Student("Michael", "Santacruzz", new int[]{1, 2, 1}));
        students.add(new Student("Szymon", "Stewenson", new int[]{3, 4, 2}));

        for (Student student : students) {
            student.displayInfo();
        }
    }
}
