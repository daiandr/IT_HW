
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MusicalInstrument that = (MusicalInstrument) o;

        if (!type.equals(that.type)) return false;
        return name.equals(that.name);

    }

    @Override
    public int hashCode() {
        int result = type.hashCode();
        result = 31 * result + name.hashCode();
        return result;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int  getPrice() {
        return price;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
