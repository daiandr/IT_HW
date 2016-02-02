package tasks.employee;


public class AllWork {

    public static final int NUMBER_OF_TASKS_IN_THE_ARRAY = 10;
    private Task[] tasks = new Task[NUMBER_OF_TASKS_IN_THE_ARRAY];
    private int freePlacesForTasks;
    private int currentUnassignedTask;

    AllWork() {
        this.freePlacesForTasks = NUMBER_OF_TASKS_IN_THE_ARRAY;
        this.currentUnassignedTask = 0;
    }

    void addTask(Task task) {
        if (task != null) {
            for (int i = 0; i < this.tasks.length; i++) {
                if (tasks[i] == null) {
                    tasks[i] = task;
                    task.setIsAssigned(false);
                    freePlacesForTasks--;
                    currentUnassignedTask = i;
                    break;
                } else {
                    continue;
                }
            }
        }
    }

    Task getNextTask() {
        for (int i = 0; i < this.tasks.length; i++) {
            if (this.tasks[i] == null) {
                continue;
            } else {
                if (this.tasks[i].getIsAssigned() == false) {
                    return this.tasks[i];
                } else {
                    continue;
                }
            }
        }
        return null;
    }


    boolean isAllWorkDone() {
        for (int i = 0; i < this.tasks.length; i++) {
            if (this.tasks[i] == null) {
                continue;
            }
            if (this.tasks[i].getWorkingHours() > 0) {
                return false;
            }
        }
        return true;
    }
}

