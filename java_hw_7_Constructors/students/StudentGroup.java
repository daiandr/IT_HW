package tasks.students;

public class StudentGroup {
    String groupSubject;
    Student[] students;
    int freePlaces;
    int nextFreePosition;

    StudentGroup() {
        this.freePlaces = 5;
        this.students = new Student[5];
    }

    StudentGroup(String subject) {
        this();
        if(subject != null && !(subject.equals(""))) {
            this.groupSubject = subject;
        }
    }

    void addStudennt(Student student) {
        if (this.freePlaces > 0 && student.subject.equals(this.groupSubject)) {
            this.students[nextFreePosition] = student;
            this.nextFreePosition++;
            this.freePlaces--;
        }
    }

    void emptyGroup() {
        this.freePlaces = 5;
        this.students = new Student[5];
    }

    void theBestStudent() {
        int max = 0;
        for (int i = 0; i < this.students.length - 1; i++) {
            if (this.students[i].grade > this.students[i + 1].grade) {
                max = i;
            }
        }

        System.out.println(this.students[max].name);
    }



    void printStudentsInGroup() {
        for (int i = 0; i < this.students.length; i++) {
            if (this.students[i] != null) {
                System.out.println("Name: " + this.students[i].name + "\nGrade: " + this.students[i].grade + "\n");
            } else {
                continue;
            }
        }
    }

}
