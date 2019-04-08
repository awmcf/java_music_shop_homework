public abstract class Instrument implements IPlay {
    protected String material;
    protected String colour;
    protected String type;
    protected int priceBought;
    protected int priceToBeSold;

    Instrument(String material, String colour, String type, int priceBought, int priceToBeSold) {
        this.material = material;
        this.colour = colour;
        this.type = type;
        this.priceBought = priceBought;
        this.priceToBeSold = priceToBeSold;
    }
}
