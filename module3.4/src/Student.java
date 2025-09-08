import java.io.Serializable;

public class Student implements Serializable {
    private int id;
    private int age;
    private String name;

    public Student(){}

    public Student(int id, int age,String name){
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString(){
        return "id: " + id + " age: " + age + " name: "+ name;
    }
}
