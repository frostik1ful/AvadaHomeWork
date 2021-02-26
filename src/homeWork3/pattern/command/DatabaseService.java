package homeWork3.pattern.command;

import java.util.List;


public class DatabaseService {
    private final List<String> users = List.of("Vasiliy", "Dima", "Kostya");
    private final List<String> passwords = List.of("qwerty", "ZxconZ2yuky5oun", "password1234");
    private final List<String> emails = List.of("Vas9@mail.ru", "Dima@gmail.com", "Kost9n2005@mail.ru");

    public List<String> getUsers() {
        return users;
    }

    public List<String> getPasswords() {
        return passwords;
    }

    public List<String> getEmails() {
        return emails;
    }
}
