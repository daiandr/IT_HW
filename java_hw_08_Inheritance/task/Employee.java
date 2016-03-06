package task;

public class Employee extends Person {

    public static final int MIN_AGE = 18;
    public static final int WORKING_HOURS = 6;
    private int daySalary;

    Employee(String name, int age, boolean isMale, int daySalary) {
        super(name, age, isMale);
        this.daySalary = daySalary;
    }

    double calculateOverTime(double hours) {
        if (this.getAge() <= MIN_AGE) {
            return 0;
        } else {
            int payPerHour = daySalary / WORKING_HOURS;
            return hours * payPerHour;
        }
    }

    void showEmployeeInfo() {
        this.showPersonInfo();
        System.out.println("Day salary: " + this.daySalary);
    }

    public int getDaySalary() {
        return daySalary;
    }

    public void setDaySalary(int daySalary) {
        if (daySalary < 0) {
            this.daySalary = daySalary;
        }
    }
}
