import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();

        persons.add(new Person("Alice", 30, "New York"));
        persons.add(new Person("Bob", 25, "Los Angeles"));
        persons.add(new Person("Charlie", 35, "New York"));
        persons.add(new Person("Diana", 28, "Chicago"));
        persons.add(new Person("Ethan", 22, "Los Angeles"));
        persons.add(new Person("Fiona", 40, "Chicago"));
        persons.add(new Person("George", 30, "Miami"));
        persons.add(new Person("Hannah", 33, "Miami"));
        persons.add(new Person("Ivan", 29, "New York"));
        persons.add(new Person("Jane", 24, "Chicago"));


        persons.sort((Person p1,Person p2) -> Integer.compare(p1.getAge(), p2.getAge()));

        persons.removeIf(p -> !p.getCity().equalsIgnoreCase("New York"));

        System.out.println("Sorted by age:");
        for (Person p : persons) {
            System.out.println(p);
        }

    }
}
