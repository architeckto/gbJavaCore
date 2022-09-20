package Lesson4.Task2;

import java.util.HashMap;

public class Phonebook {

    private final HashMap<String, String> phoneBook = new HashMap<>();

    public void add(String phone, String surname) {
        phoneBook.put(phone, surname);
    }

    public String getPhoneBySurname(String surname) {
        if (phoneBook.containsValue(surname)) {
            StringBuilder result = new StringBuilder("Phone numbers for " + surname + ": \n");
            for (String key : phoneBook.keySet()) {
                if (phoneBook.get(key).equals(surname)) result.append(key).append("; \n");
            }
            return result.toString();
        } else return "Can't find numbers for " + surname;
    }
}
