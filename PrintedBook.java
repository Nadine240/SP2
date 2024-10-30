package LibraryRoyalty;

public class PrintedBook extends Title{
    private int pages;

    public PrintedBook(String title, String literatureType, int copies, int pages) {
        super(title, literatureType, copies);
        this.pages = pages;
    }

@Override
public double calculatePoints(){
    double pointPerPage = getPointPerPage();
    return pages * pointPerPage * copies;

    }
    // retunerer point baseret på litteraturtype
private double getPointPerPage() {
        switch (literatureType){
            case "BI": return 1.0;
            case "TE": return 3.0;
            case "LYRIK": return 1.5;
            case "SKØN": return 2.0;
            case "FAG": return 1.0;
            default: return 1.0;

        }
    }
}

