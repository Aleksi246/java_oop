import java.io.*;

public class Task3 {
    public static void main(String[] args) {
        Student student1 = new Student(13245, 3, "matti");
        Student student2 = new Student(26543, 67, "hatti");
        Student student3 = new Student(2543, 24, "vatti");
        Student student = new Student();


        Course course1 = new Course("zxc2", "kokkioppi", "joku");
        Course course2 = new Course("zxc3", "aaaaaaa", "joku2");
        Course course3 = new Course("zxc4", "bbbbb", "joku3");

        Enrollment enrollment1 = new Enrollment(student1, course1, "01.01.2025");
        Enrollment enrollment2 = new Enrollment(student2, course1, "01.01.2025");
        Enrollment enrollment3 = new Enrollment(student3, course2, "01.01.2024");
        Enrollment enrollment = new Enrollment();

        File file = new File("enrollments.ser");

        try (
                FileOutputStream outputstream = new FileOutputStream(file);
                ObjectOutputStream objects = new ObjectOutputStream(outputstream);
        ) {
            objects.writeObject(enrollment1);
            objects.writeObject(enrollment2);
            objects.writeObject(enrollment3);
            objects.writeObject(student3);

        } catch (Exception e) {
            e.printStackTrace();
        }


        try (
                FileInputStream inputstream = new FileInputStream(file);
                ObjectInputStream objects = new ObjectInputStream(inputstream);
        ) {
            enrollment = (Enrollment) objects.readObject();
            System.out.println(enrollment);
            enrollment = (Enrollment) objects.readObject();
            System.out.println(enrollment);
            enrollment = (Enrollment) objects.readObject();
            System.out.println(enrollment);
            student = (Student) objects.readObject();
            System.out.println(student);

        } catch (Exception e) {
            System.err.println(e);
        }

    }
}
