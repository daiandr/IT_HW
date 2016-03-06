package bank_hacker;

public class Hacker implements Runnable {

    public static final int MONEY_TO_STEAL = 20;
    private Acoount acc;

    public Hacker(Acoount acc) {
        this.acc = acc;
    }

    @Override
    public void run() {
        this.acc.withdrawal(MONEY_TO_STEAL);
    }
}
