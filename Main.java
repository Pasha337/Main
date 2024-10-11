public class Main {
    public static void main(String[] args) {
        Person[] persons = new Person[5];

        persons[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persons[1] = new Person("Petrov Petr", "Manager", "petrov@mailbox.com", "8912123456", 50000, 40);
        persons[2] = new Person("Sidorov Sidor", "Developer", "sidorov@mailbox.com", "8901234567", 70000, 28);
        persons[3] = new Person("Fedorov Fedor", "Analyst", "fedorov@mailbox.com", "8999111222", 60000, 45);
        persons[4] = new Person("Smirnov Sergey", "Designer", "sergey@mailbox.com", "8933123456", 40000, 35);

        for (Person person : persons) {
            person.printInfo();
            System.out.println();
        }
    }
}