public class Exam {
    private String name;
    public int score;
    private Student student;

    public Exam(String name, int score, Student student) {
        this.name = name;
        this.score = score;
        this.student = student;
    }

    public Exam(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Exam " +
                "name = " + name + '\'' +
                ", score" + score +
                ", student =" + student;
    }
}
