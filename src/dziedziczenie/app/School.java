package dziedziczenie.app;

import dziedziczenie.model.Student;
import dziedziczenie.model.Teacher;

/**
 * Created by Kasia on 12.01.2017.
 */
public class School {
    public static void main(String[] args) {
        Student student = new Student("Jan","Kowalski",123456);
        Teacher teacher = new Teacher("Wojciech","Nowak","doktor");

        student.show();
        System.out.println();
        teacher.show();
    }
}
