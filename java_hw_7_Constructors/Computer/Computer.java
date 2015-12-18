package tasks.computer;

public class Computer {

	int year;
	double price;
	boolean isNotebook;
	int hardDiskMemory;
	int freeMemory;
	String operatingSystem;

	Computer() {
		this.isNotebook = false;
		this.operatingSystem = "WindowsXP";
	}
	
	Computer(int year, double price, int hardDiskMemory, int freeMemory){
		
		this();
		if (year <= 2015 && year >= 1990) {
			this.year = year;
		}
		if (price > 0) {
			this.price = price;
		}
		if (hardDiskMemory > 0) {
			this.hardDiskMemory = hardDiskMemory;
		}
		if (freeMemory >= 0) {
			this.freeMemory = freeMemory;
		}
	}
	

	Computer(int year, double price, boolean isNotebook, int hardDiskMemory, int freeMemory, String operatingSystem) {		
		
		if (year <= 2015 && year >= 1990) {
			this.year = year;
		}
		if (price > 0) {
			this.price = price;
		}
		this.isNotebook = isNotebook;
		
		if (hardDiskMemory > 0) {
			this.hardDiskMemory = hardDiskMemory;
		}
		if (freeMemory >= 0) {
			this.freeMemory = freeMemory;
		}
		if (operatingSystem != null && operatingSystem != "") {
			this.operatingSystem = operatingSystem;
		}
	}
	
	int comparePrice(Computer comp){
		if (this.price > comp.price) {
			return -1;
		}else if (this.price < comp.price) {
			return 1;
		}
		return 0;
		
	}
	
	

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
