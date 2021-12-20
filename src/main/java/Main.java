import java.util.Scanner;

public class Main {

    Scanner scanner = new Scanner(System.in);
    Scanner scannerInt = new Scanner(System.in);
    School school = new School();

    public static void main(String[] args) {
        Main main = new Main();
        main.Menu();
    }

    void Menu() {
        String userChoice;

        do {
            System.out.println("Please choose what you want to do:" +
                    "\n 1. Go to student section" +
                    "\n 2. Go to teacher section" +
                    "\n 3. Go to course section" +
                    "\n 4. Go to exam results" +
                    "\n Enter QUIT to exit" +
                    "\n PLEASE ENTER A NUMBER:");
            userChoice = scanner.nextLine().toUpperCase();

            switch (userChoice) {
                case "1":
                    studentSection();
                    break;
                case "2":
                    teacherSection();
                    break;
                case "3":
                    courseSection();
                    break;
                case "4":
                    examResults();
                    break;
            }
        } while (!userChoice.equalsIgnoreCase("QUIT"));
    }

    public void studentSection() {
        String userInput;
        do {
            System.out.println("Welcome to Student section Please choose what you want to do:" +
                    "\n 1. Add student" +
                    "\n 2. See all students" +
                    "\n 3. Edit student" +
                    "\n 4. Delete student." +
                    "Enter QUIT to return" +
                    "\n PLEASE ENTER A NUMBER:");
            userInput = scanner.nextLine().toUpperCase();

            switch (userInput) {
                case "1":
                    school.createStudent();
                    break;
                case "2":
                    school.seeStudent();
                    break;
                case "3":
                    school.editStudent();
                    break;
                case "4":
                    school.deleteStudent();
                    break;
            }
        } while (!userInput.equalsIgnoreCase("QUIT"));

    }
    public void teacherSection() {
        String userInput;
        do {
            System.out.println("Welcome to Teacher section. Please choose what you want to do:" +
                    "\n 1. Add a teacher" +
                    "\n 2. See all teachers" +
                    "\n 3. Edit teacher" +
                    "\n 4. Delete teacher." +
                    "Enter QUIT to return" +
                    "\n PLEASE ENTER A NUMBER:");
            userInput = scanner.nextLine().toUpperCase();

            switch (userInput) {
                case "1":
                    school.createTeacher();
                    break;
                case "2":
                    school.seeTeacher();
                    break;
                case "3":
                    school.editTeacher();
                    break;
                case "4":
                    school.deleteTeacher();
                    break;
            }
        } while (!userInput.equalsIgnoreCase("QUIT"));
    }

    public void courseSection() {
        String userInput;
        do {
            System.out.println("Welcome to the Course section. Please choose what you want to do:" +
                    "\n 1. Add a course" +
                    "\n 2. See all courses" +
                    "\n 3. Edit a course" +
                    "\n 4. Delete course." +
                    "Enter QUIT to return" +
                    "\n PLEASE ENTER A NUMBER:");
            userInput = scanner.nextLine().toUpperCase();

            switch (userInput) {
                case "1":
                    school.createCourse();
                    break;
                case "2":
                    school.seeCourse();
                    break;
                case "3":
                    school.editCourse();
                    break;
                case "4":
                    school.deleteCourse();
                    break;
            }
        } while (!userInput.equalsIgnoreCase("QUIT"));

    }
    public void examResults() {
        String userInput;
        do {
            System.out.println("EXAM RESULTS. Please choose what you want to do:" +
                    "\n 1. Add exam" +
                    "\n 2. Add a student and result to an exam" +
                    "\n 3. See all exam results" +
                    "\n" +
                    "Enter QUIT to return" +
                    "\n PLEASE ENTER A NUMBER:");
            userInput = scanner.nextLine().toUpperCase();

            switch (userInput) {
                case "1":
                    school.createExam();
                    break;
                case "2":
                    school.addStudentToExam();
                    break;
                case "3":
                    school.seeExams();
                    break;

            }
        } while (!userInput.equalsIgnoreCase("QUIT"));

    }
}