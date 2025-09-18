package Lesson_6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        /* Задание 1
        Создайте класс Student, содержащий следующие характеристики – имя, группа, курс, оценки по предметам.
        Создайте коллекцию, содержащую объекты класса Student. Следует написать метод,
        который удаляет студентов со средним баллом < 3, а также отдельный метод, который переводит студента на следующий курс,
        если средний балл >= 3. Напишите метод printStudents(Set<Student> students, int course), который получает список студентов и номер курса.
        Метод печатает на консоль имена тех студентов, которые обучаются на данном курсе.*/

        Set<Student> students = new HashSet<>();

        students.add(new Student("Иван", "М-1", 1, new double[]{4, 5, 4}));
        students.add(new Student("Петр", "М-1", 1, new double[]{2, 2, 2}));
        students.add(new Student("Анна", "М-2", 2, new double[]{3, 4, 5}));

        System.out.println("Все студенты:");
        for (Student student : students) {
            student.showInfo();
        }

        StudentUtils.removeWeakStudents(students);

        StudentUtils.promoteStudents(students);

        System.out.println("\nСтуденты 2 курса:");
        StudentUtils.printStudents(students, 2);

        /* Задание 2
        Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
        В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать номер телефона по фамилии.
        Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны в
        ыводиться все телефоны.*/

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Иванов", "123-45-67");
        phoneBook.add("Петров", "987-65-43");
        phoneBook.add("Сидоров", "111-22-33");

        String surname = "Иванов";
        ArrayList<String> phones = phoneBook.get(surname);

        System.out.println("\nТелефонный справочник:");
        System.out.println("Ищем фамилию: " + surname);

        if (phones.size() > 0) {
            System.out.println("Найденные номера:");
            for (String phone : phones) {
                System.out.println(phone);
            }
        } else {
            System.out.println("Номер не найден");
        }
    }
}
