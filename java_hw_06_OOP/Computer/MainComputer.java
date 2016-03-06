package tasks.computer;
public class MainComputer {

	public static void main(String[] args) {

		Computer myPC = new Computer();

		myPC.year = 2012;
		myPC.price = 1600.00;
		myPC.hardDiskMemory = 1000;
		myPC.freeMemory = 8000;
		myPC.operatingSystem = "Windows 10";

		Computer yourPC = new Computer();

		yourPC.year = 2014;
		yourPC.price = 2000.00;
		yourPC.hardDiskMemory = 1500;
		yourPC.freeMemory = 12000;
		yourPC.operatingSystem = "Windows 7";

		myPC.useMemory(100);
		yourPC.changeOperationSystem("Windows 8.1");

		System.out.println("--myPC--\nYear: " + myPC.year +  "\nPrice: " + myPC.price + "\nHDD memory: " + myPC.hardDiskMemory
				+ "\nFree Memory: " + myPC.freeMemory + "\nOperating system: " + myPC.operatingSystem + "\nisNotebook: " + myPC.isNotebook);
		
		System.out.println("\n--yourPC--\nYear: " + yourPC.year +  "\nPrice: " + yourPC.price + "\nHDD memory: " + yourPC.hardDiskMemory
				+ "\nFree Memory: " + yourPC.freeMemory + "\nOperating system: " + yourPC.operatingSystem + "\nisNotebook: " + yourPC.isNotebook);

	}

}
