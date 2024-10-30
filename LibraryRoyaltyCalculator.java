package LibraryRoyalty;

import java.util.ArrayList;
import java.util.List;

public class LibraryRoyaltyCalculator {
    private List<Title> titles;

    public LibraryRoyaltyCalculator() {
        titles = new ArrayList<>();

    }

    public void addTitle(Title title){
    titles.add(title);

    }

    public double calculateTotalPay(){
        double totalPay = 0;
        for(Title title : titles){
            totalPay += title.calculateRoyalties();

        }
    return totalPay;

    }

    public static void main(String[] args) {
        LibraryRoyaltyCalculator calculator = new LibraryRoyaltyCalculator();

        calculator.addTitle(new PrintedBook("Title1", "TE", 140, 72));
        calculator.addTitle(new AudioBook("Title2", "SKØN", 10, 400));
    }
}
