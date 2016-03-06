package task;

public class Student extends Person {

    public static final int MIN_GRADE = 2;
    public static final int MAX_GRADE = 6;
    private double score;

    Student(String name, int age, boolean isMale, double score) {
        super(name, age, isMale);
        if (score >= MIN_GRADE && score <= MAX_GRADE) {
            this.score = score;
        }
    }

    void showStudentInfo() {
        this.showPersonInfo();
        System.out.println("Grade: " + this.score);

    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        if (score >= MIN_GRADE && score <= MAX_GRADE) {
            this.score = score;
        }
    }
}
