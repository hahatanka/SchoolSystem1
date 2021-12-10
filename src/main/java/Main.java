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
                    //teacherSection();
                    break;
                case "3":
                    //courseSection();
                    break;
                case "4":
                    //examResults();
                    break;
            }
        } while (!userChoice.equalsIgnoreCase("QUIT"));
    }

    public void studentSection() {
        String userInput;
        do {
            System.out.println("Welcome to Student section Please choose what you want to do:" +
                    "\n 1. Add student" +
                    "\n 2. See student" +
                    "\n 3. Edit student" +
                    "\n 4. Delete student." +
                    "Enter QUIT to return" +
                    "\n PLEASE ENTER A NUMBER:");
            userInput = scanner.nextLine().toUpperCase();

            switch (userInput) {
                case "1":
                    createStudent();
                    break;
                case "2":
                    seeStudent();
                    break;
                case "3":
                    //editStudent();
                    break;
                case "4":
                    //deleteStudent();
                    break;
            }
        } while (!userInput.equalsIgnoreCase("QUIT"));

    }

    void createStudent(){
        System.out.println("Creating a student.. Please enter the name:");
        String name = scanner.nextLine();
        System.out.println("Please enter ID:");
        int id = scannerInt.nextInt();
        Student student = new Student(id, name);
        school.addStudent(student);
        System.out.println("Student " + student.getName() + " has been added" + "\n");

    }

    void seeStudent(){
        System.out.println("List of students: ");
        for (Student student: school.getStudents()){
            System.out.println(student);
        }
        System.out.println("\n");
    }

}