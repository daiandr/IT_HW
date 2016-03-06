package car_assembly;


public class Engine extends CarPart {


    @Override
    public String getPartName() {
        return " Engine";
    }

    @Override
    public int getTime() {
        return 7000;
    }
}
