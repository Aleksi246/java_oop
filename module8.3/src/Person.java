import java.util.Comparator;

public class Person {
    private String name;
    private int age;
    private String city;

    Person(String name, int age, String city){
        this.name = name;
        this.age = age;
        this.city = city;
    }


    @Override
    public String toString() {
        return name + " (" + age + ", " + city + ")";
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public String getName() {
        return name;
    }
}
