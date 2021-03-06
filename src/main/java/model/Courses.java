package model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "courses")
//@NamedQueries( {
//
//})


public class Courses {


    @Id
    @Column(name = "course_name")
    private String courseName;
    @Column(name = "course_description")
    private String courseDescription;
    @Column(name = "teacher_id")
    private int teacherId;

    List<Courses> courses = new ArrayList<Courses>();

    public void addCourse (Courses course) {
        courses.add(course);
    }



    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "courseName='" + courseName + '\'' +
                ", courseDescription='" + courseDescription + '\'' +
                ", teacherId=" + teacherId +
                '}';
    }

}
