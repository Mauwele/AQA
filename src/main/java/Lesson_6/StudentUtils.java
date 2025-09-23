package Lesson_6;

import java.util.Set;
import java.util.HashSet;

public class StudentUtils {

    public static void removeWeakStudents(Set<Student> students) {

        Set<Student> iterator = new HashSet<>(students);

        for (Student student : iterator) {
            if (student.getAverageGrade() < 3) {
                students.remove(student);
            }
        }
    }

    public static void promoteStudents(Set<Student> students) {
        for (Student student : students) {
            if (student.getAverageGrade() >= 3) {
                student.nextCourse();
            }
        }
    }

    public static void printStudents(Set<Student> students, int course) {
        for (Student student : students) {
            if (student.course == course) {
                System.out.println(student.name);
            }
        }
    }
}
