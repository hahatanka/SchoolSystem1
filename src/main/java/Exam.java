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



    @Override
    public String toString() {
        return "Exam " +
                "name = " + name + '\'' +
                ", score" + score +
                ", student =" + student;
    }
}
