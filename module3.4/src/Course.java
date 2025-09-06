import java.io.Serializable;

public class Course implements Serializable {
    private String courseCode;
    private String courseName;
    private String instructor;

    public Course(String code, String name, String instructor){
        this.courseCode = code;
        this.courseName = name;
        this.instructor = instructor;
    }

    @Override
    public String toString(){
        return "coursecode: " + courseCode + " coursename: " + courseName + " instructor: "+ instructor;
    }
}
