package Ships;

public abstract class Ship {

    private int length;


    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length >= 3) {
            this.length = length;
        }else{
            System.out.println("Error!");
        }
    }
}
