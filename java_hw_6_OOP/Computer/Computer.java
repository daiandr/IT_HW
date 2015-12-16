package tasks.computer;

public class Computer {

	int year;
	double price;
	boolean isNotebook;
	int hardDiskMemory;
	int freeMemory;
	String operatingSystem;

	void changeOperationSystem(String newOperationSystem) {
		this.operatingSystem = newOperationSystem;
	}

	int useMemory(int memory) {
		if (memory > this.freeMemory) {
			System.out.println("Not enough memory!");
		}
		if (memory < 0) {
			System.out.println("Error!");
		} else {
			this.freeMemory -= memory;
		}
		return this.freeMemory;
	}

}
