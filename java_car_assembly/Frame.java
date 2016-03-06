package car_assembly;


public class Frame extends CarPart {


    @Override
    public String getPartName() {
        return " Frame";
    }

    @Override
    public int getTime() {
        return 5000;
    }
}
