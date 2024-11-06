import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<String>> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void add(String surname, String phoneNumber) {
        phoneBook.putIfAbsent(surname, new ArrayList<>());
        phoneBook.get(surname).add(phoneNumber);
    }

    public List<String> get(String surname) {
        return phoneBook.getOrDefault(surname, new ArrayList<>());
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Ivanov", "+79622613433");
        phoneBook.add("Petrov", "+79622613434");
        phoneBook.add("Ivanov", "+79622613435");
        phoneBook.add("Sidorov", "+79622613436");

        System.out.println("Номера Ivanov: " + phoneBook.get("Ivanov"));
        System.out.println("Номера Petrov: " + phoneBook.get("Petrov"));
        System.out.println("Номера Sidorov: " + phoneBook.get("Sidorov"));
    }
}