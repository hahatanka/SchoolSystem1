import java.util.ArrayList;

public class School {

    public ArrayList<Student> students;
    public ArrayList<Teacher> teachers;
    public ArrayList<Course> courses;

    public School() {
        students = new ArrayList<>();
        teachers = new ArrayList<>();
        courses = new ArrayList<>();
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }


    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void addStudent(Student student){
        this.students.add(student);
    }

}
