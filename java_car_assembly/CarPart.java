package car_assembly;


public abstract class CarPart implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +" Start"+ getPartName());

        try {
            Thread.sleep(getTime());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + " Done" + getPartName());
    }

    public abstract String getPartName();

    public abstract int getTime();
}
