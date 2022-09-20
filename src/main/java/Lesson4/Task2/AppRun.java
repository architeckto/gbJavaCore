package main.java.Lesson4.Task2;

public class AppRun {

    public static void main(String[] args) {

        Phonebook phonebook = new Phonebook();
        phonebook.add("111","Ivanov");
        phonebook.add("222","Ivanov");
        phonebook.add("333","Petrov");
        phonebook.add("444","Sidorov");
        phonebook.add("555","Sidorov");
        phonebook.add("666","Sidorov");
        phonebook.add("777","Noname");
        phonebook.add("888","Ivanov");
        phonebook.add("999","Sidorov");
        phonebook.add("000","Sidorov");

        System.out.println(phonebook.getPhoneBySurname("Sidorov"));
        System.out.println(phonebook.getPhoneBySurname("Petrov"));
        System.out.println(phonebook.getPhoneBySurname("Lastname"));

    }

}
