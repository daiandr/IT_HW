package tasks.employee;

public class WorkMain {

    public static void main(String[] args) {

        Task raota = new Task();

        Employee gosho = new Employee("George");
        gosho.setCurrentTask(raota);
        gosho.setHoursLeft(6);

        gosho.work();
        gosho.showReport();
    }
}
