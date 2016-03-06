package bank_hacker;

public class Acoount {

    private Integer money = 100;

    public void withdrawal(int amount) {
        synchronized (money) {
            if (amount <= this.money) {
                try {
                    Thread.sleep(3000);
                    money -= amount;
                    System.out.println(getMoney());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("No sufficient fonds!");
            }
        }
    }
    public int getMoney() {
        return money;
    }
}
