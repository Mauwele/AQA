package Lesson_6;

import java.util.HashMap;
import java.util.ArrayList;

public class PhoneBook {

    HashMap<String, ArrayList<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void add(String surname, String phoneNumber) {
        if (!phoneBook.containsKey(surname)) {
            phoneBook.put(surname, new ArrayList<>());
        }
        phoneBook.get(surname).add(phoneNumber);
    }

    public ArrayList<String> get(String surname) {
        return phoneBook.getOrDefault(surname, new ArrayList<>());
    }
}
