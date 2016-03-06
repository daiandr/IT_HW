package bank_hacker;


public class Demo {

    public static final int NUMBER_OF_HACKERS = 10;

    public static void main(String[] args) {
        Acoount acc = new Acoount();

        for (int i = 0; i < NUMBER_OF_HACKERS; i++) {
            new Thread(new Hacker(acc)).start();
        }

    }

}
