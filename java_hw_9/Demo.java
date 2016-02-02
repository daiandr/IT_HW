package tasks.employee;

public class Demo {
    public static void main(String[] args) {


        Employee dayan = new Employee("Dayan");
        Employee todor = new Employee("Todor");
        Employee denis = new Employee("Denis");

        Task task1 = new Task("task1", 23);
        Task task2 = new Task("task2", 8);
        Task task3 = new Task("task3", 16);

        AllWork newWork = new AllWork();

        newWork.addTask(task1);
        newWork.addTask(task2);
        newWork.addTask(task3);

        dayan.setAllWork(newWork);
        dayan.startWorkingDay();
        dayan.work();

        System.out.println(dayan.getHoursLeft());


    }
}
