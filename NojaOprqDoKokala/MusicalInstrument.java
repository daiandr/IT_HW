
public class MusicalInstrument {

    private String type;
    private String name;
    private int price;
    private int quantity;
    private boolean isAvailable;


    public MusicalInstrument(String type, String name, int price) {

        this.type = type;
        this.name = name;
        this.price = price;
    }



    @Override
    public String toString() {
        return "MusicalInstrument{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", isAvailable=" + isAvailable +
                '}';
    }


    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
