package LibraryRoyalty;

public abstract class Title {
    protected String title;
    protected String literatureType;
    protected int copies;

    public Title(String title, String literatureType, int copies) {
        this.title = title;
        this.literatureType = literatureType; // initialiserer attributter
        this.copies = copies;
    }

    public abstract double calculatePoints(); // metode til beregning point
    public double calculateRoyalties () {
        return calculatePoints() * 0.067574;
    }
}
