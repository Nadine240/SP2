package LibraryRoyalty;

public class AudioBook extends Title {
    private int durationInMinutes;

public AudioBook(String title, String literatureType, int copies, int durationInMinutes){
    super(title, literatureType, copies);
    this.durationInMinutes = durationInMinutes; // initialiserer varighed
}

// beregner point for en lydbog
@Override
public double calculatePoints(){
    double pointPerMinute = getPointPerMinute() * copies;
    return (durationInMinutes * 0.5) * pointPerMinute * copies;
}

private double getPointPerMinute() {
    switch (literatureType) {
        case "BI":
            return 1.0;
        case "TE":
            return 1.5;
        case "LYRIK":
            return 0.3;
        case "SKØN":
            return 0.85;
        case "FAG":
            return 0.5;
        default:
            return 0.5;
     }
  }
}
