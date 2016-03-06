package car_assembly;

public class Seat extends CarPart {

    @Override
    public String getPartName() {
        return " Seat";
    }

    @Override
    public int getTime() {
        return 3000;
    }

}
