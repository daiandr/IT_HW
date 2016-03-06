package tasks.students;

public class College {

    public static void main(String[] args) {

        Student pesho = new Student("Petyr", "Pokemon", 20);
        Student gosho = new Student("George", "Pokemon", 21);


        gosho.receiveScholarship(3.3, 250.0);
        pesho.upYear();
        pesho.upYear();
        pesho.upYear();

        System.out.println(gosho.moneyFromScholarship);
        System.out.println(pesho.yearInCollage + " " + pesho.hasDegree);

        StudentGroup myGroup = new StudentGroup("Pokemon");

        myGroup.addStudennt(pesho);
        myGroup.addStudennt(gosho);

        myGroup.printStudentsInGroup();

        pesho.grade = 5.0;

        myGroup.theBestStudent();

        myGroup.emptyGroup();

        //  myGroup.printStudentsInGroup();
    }
}
