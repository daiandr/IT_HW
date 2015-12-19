package tasks.students;

public class Student {

    String name;
    String subject;
    double grade;
    int yearInCollage;
    int age;
    boolean hasDegree;
    double moneyFromScholarship;

    Student() {
        this.grade = 4.0;
        this.yearInCollage = 1;
        this.hasDegree = false;
        this.moneyFromScholarship = 0.0;
    }

    Student(String name, String subject, int age) {
        this();

        if (name != null && !(name.equals(""))) {
            this.name = name;
        }
        if (subject != null && !(subject.equals(""))) {
            this.subject = subject;
        }
        if (age > 0) {
            this.age = age;
        }
    }

    void upYear() {
        if (grade > 2) {
            this.yearInCollage++;
            if (this.yearInCollage == 4) {
                this.hasDegree = true;
            }
        } else {
            System.out.println("DAMN BOY!");
        }
    }

    double receiveScholarship(double min, double amount){
        if(this.grade >= min){
            this.moneyFromScholarship += amount;
        }
        if(this.age < 30) {
            return this.moneyFromScholarship;
        }else{
            return 0;
        }
    }
}
