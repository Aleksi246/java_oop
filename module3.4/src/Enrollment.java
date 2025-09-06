import java.io.Serializable;

public class Enrollment implements Serializable {
    private Student student;
    private Course course;
    private String enrollmentDate;


    public Enrollment(){
    }

    public Enrollment(Student student, Course course, String date){
        this.student = student;
        this.course = course;
        this.enrollmentDate = date;
    }

    @Override
    public String toString(){
        return " student: " + student.toString() +"\n course: " + course.toString() + "\n enrollment date: " + enrollmentDate;
    }
}
