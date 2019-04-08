import java.util.ArrayList;

public class Guitar extends Instrument {
    protected ArrayList<GuitarString> guitarStrings;
    protected String size;

    Guitar(String material, String colour, String type, int priceBought, int priceToBeSold, ArrayList guitarStrings, String size) {
        super(material, colour, type, priceBought, priceToBeSold);
        this.guitarStrings = new ArrayList<>();
        this.size = size;
    }

    public String play() {
        return "Guitar ohhh yeah";
    }
}
