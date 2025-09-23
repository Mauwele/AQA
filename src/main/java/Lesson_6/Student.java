package Lesson_6;

public class Student {

    String name;
    String group;
    int course;
    double[] grades;

    public Student(String name, String group, int course, double[] grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public double getAverageGrade() {
        double sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum = sum + grades[i];
        }
        return sum / grades.length;
    }

    public void nextCourse() {
        course = course + 1;
    }

    public void showInfo() {
        System.out.println("Студент: " + name);
        System.out.println("Группа: " + group);
        System.out.println("Курс: " + course);
        System.out.println("Средний балл: " + getAverageGrade());
    }
}
