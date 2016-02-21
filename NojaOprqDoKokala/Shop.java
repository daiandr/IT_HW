import java.util.HashSet;

public class Shop {

    int availabeleMoney;
    HashSet<MusicalInstrument> instrumentsForSale = new HashSet<MusicalInstrument>();
    HashSet<MusicalInstrument> soldInstruments = new HashSet<MusicalInstrument>();


    public void  addInstrument(MusicalInstrument instrument){
        if (instrument != null) instrumentsForSale.add(instrument);
    }

    public void sellInstrument(MusicalInstrument instrument){

    }

}
