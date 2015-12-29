package task;

public class MainPerson {

    public static void main(String[] args) {

        Person[] people = new Person[10];

        people[0] = new Person("Petyr", 21, true);
        people[1] = new Person("George", 21, true);
        people[2] = new Student("Ivan", 22, true, 4.25);
        people[3] = new Student("Mariya", 18, false, 5.10);
        people[4] = new Employee("Dimityr", 41, true, 50);
        people[5] = new Employee("Todor", 21, true, 100);


        for (int i = 0; i < people.length; i++) {
            if (people[i] != null) {
                if (people[i].getClass().getSimpleName().equals("Person")) {
                    people[i].showPersonInfo();
                    System.out.println();
                }
                if (people[i].getClass().getSimpleName().equals("Student")) {
                    ((Student) people[i]).showStudentInfo();
                    System.out.println();
                }
                if (people[i].getClass().getSimpleName().equals("Employee")) {
                    ((Employee) people[i]).showEmployeeInfo();
                    System.out.println();
                }
            } else {
                continue;
            }
        }

        for (int i = 0; i < people.length; i++) {
            if (people[i] != null) {
                if (people[i].getClass().getSimpleName().equals("Employee")) {
                    System.out.print(people[i].getName() + ": ");
                    System.out.print(((Employee) people[i]).calculateOverTime(2) + " lv (Overtime)");
                    System.out.println();
                } else {
                    continue;
                }
            } else {
                continue;
            }
        }


    }
}
