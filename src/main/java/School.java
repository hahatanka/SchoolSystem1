

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class School {
    Scanner scanner = new Scanner(System.in);
    Scanner scannerInt = new Scanner(System.in);

    public ArrayList<Student> students;
    public ArrayList<Teacher> teachers;
    public ArrayList<Course> courses;
    public ArrayList<Exam> examResults;

    public School() {
        students = new ArrayList<>();
        teachers = new ArrayList<>();
        courses = new ArrayList<>();
        examResults = new ArrayList<>();
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

    public ArrayList<Exam> getExamResults() {
        return examResults;
    }


    public void addStudent(Student student){
        this.students.add(student);
    }
    public void addTeacher(Teacher teacher){
        this.teachers.add(teacher);
    }

    void createStudent(){
        System.out.println("Creating a student.. Please enter the name:");
        String name = scanner.nextLine();
        System.out.println("Please enter ID:");
        int id = scannerInt.nextInt();
        Student student = new Student(id, name);
        addStudent(student);
        System.out.println("Student " + student.getName() + " has been added" + "\n");

    }

    void seeStudent(){
        System.out.println("List of students: ");
        for (Student student: getStudents()){
            System.out.println(student);
        }
        System.out.println("\n");
    }
    public Student findStudent() {
        System.out.println("Please enter the name of the student: ");
       String  name = scanner.nextLine();
        System.out.println("Please enter the ID of the student: ");
        int id = scannerInt.nextInt();
        for (Student student : students) {
            if ((Objects.equals(student.getId(), id)) && (name.equalsIgnoreCase(student.getName()))) {
                return student;
            } else {
                System.out.println("No such student registered");
            }
        } return null;
    }


        public String editStudent(){
        Student student = findStudent();
           System.out.println("You are about to edit student " + student.getName() + ". Please enter new name: ");
                String newName = scanner.nextLine();
                student.setName(newName);
                return "New student: ID " + student.getId() + ", name: " + student.getName();
            }


    void deleteStudent(){

        Student student = findStudent();
        students.remove(student);
        System.out.println("You have removed student " + student.getName());
    }

    void createTeacher(){
        System.out.println("Creating a teacher.. Please enter the name:");
        String name = scanner.nextLine();
        System.out.println("Please enter ID:");
        int id = scannerInt.nextInt();
        Teacher teacher = new Teacher(name, id);
        addTeacher(teacher);
        System.out.println("teacher " + teacher.getName() + " has been added" + "\n");
    }

    void seeTeacher(){
        System.out.println("List of teachers: ");
        for (Teacher teacher: getTeachers()){
            System.out.println(teacher);
        }
        System.out.println("\n");
    }

    public Teacher findTeacher() {
        System.out.println("Please enter the name of the teacher: ");
        String name = scanner.nextLine();
        System.out.println("Please enter the ID of the teacher: ");
        int id = scannerInt.nextInt();
        for (Teacher teacher : teachers) {
            if ((Objects.equals(teacher.getId(), id)) && (name.equalsIgnoreCase(teacher.getName()))) {
                return teacher;
            }
        }
        return null;
    }

    public String editTeacher(){
        Teacher teacher = findTeacher();
        System.out.println("You are about to edit teacher " + teacher.getName() + ". Please enter new name: ");
        String newName = scanner.nextLine();
        teacher.setName(newName);
        return "New student: ID " + teacher.getId() + ", name: " + teacher.getName();
    }

    void deleteTeacher(){
        Teacher teacher = findTeacher();
        teachers.remove(teacher);
        System.out.println("You have removed teacher " + teacher.getName());
    }

    public Course createCourse(){
        System.out.println("Please enter the name of the course:");
        String name = scanner.nextLine();
        System.out.println("Please add a teacher. See teachers available:");
        System.out.println(getTeachers());
        Teacher teacher = findTeacher();
        Course course = new Course(name,teacher);
        this.courses.add(course);
        return course;
    }

    void seeCourse(){
        System.out.println("List of courses: ");
        for (Course courses: getCourses()){
            System.out.println(courses);
        }
        System.out.println("\n");
    }

    public Course findCourse() {
        System.out.println("Please enter the name of the course: ");
        String name = scanner.nextLine();
        for (Course course: courses) {
            if (name.equalsIgnoreCase(course.getName())) {
                return course;
            } else {
                System.out.println("No such course registered");
                break;
            }
        } return null;
    }

    public void editCourse(){
        Course course = findCourse();
        System.out.println("You are about to edit " + course.getName() + "course. Please enter new name: ");
        String newName = scanner.nextLine();
        course.setName(newName);
        System.out.println("Please add a teacher. See teachers available:");
        System.out.println(getTeachers());
        Teacher teacher = findTeacher();
        course.setTeacher(teacher);
        System.out.println("New Course: Name " + teacher.getName() + ", Teacher attached: " + teacher.getName());

    }

    void deleteCourse(){
        Course course = findCourse();
        courses.remove(course);
        System.out.println("You have removed course " + course.getName());
    }

    void createExam() {
        System.out.println("New Exam. Please enter the name:");
        String name = scanner.nextLine();
        Exam exam = new Exam(name);
        examResults.add(exam);
        System.out.println("New exam for " + exam.getName() + " has been added");
    }
    public Exam findExam() {
        System.out.println("Please enter the name of the exam: ");
        String name = scanner.nextLine();
        for (Exam exam: examResults) {
            if (name.equalsIgnoreCase(exam.getName())) {
                return exam;
            } else {
                System.out.println("No such exam registered");
                break;
            }
        } return null;
    }

        void addStudentToExam(){
            System.out.println("Please choose a student. Here are all students available: ");
            seeStudent();
            Student student = findStudent();
            Exam exam = findExam();
            System.out.println("Please enter the score: ");
            int score = scannerInt.nextInt();
            exam = new Exam(exam.getName(), score, student);
            examResults.add(exam);
            System.out.println("The result has been added successfully!");
    }

    void seeExams(){
        System.out.println("List of exam results: ");
        for (Exam examList : getExamResults()){
            System.out.println(examList);
        }
        System.out.println("\n");
    }


}
