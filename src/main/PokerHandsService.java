package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class PokerHandsService {

    // instatiate new hashset
    Set<String> pokerHands = new HashSet<String>();

    // Read the PokerHands.csv file using the file service and adding them into a
    // Set

    public Set<String> readPokerHandsCSV(String filePath) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            pokerHands.add(line);

        }
        reader.close();

        return pokerHands;
    }

    // Displaying the Poker hands to the console
    public void displayPokerHands() {
        for (String pokerHands : pokerHands) {
            System.out.println(pokerHands);
        }

    }

    // Updating an item in the Set
    public void updatePokerHands(String pokerHands) {
        if (this.pokerHands.contains(pokerHands)) {
            this.pokerHands.remove(pokerHands);
            this.pokerHands.add(pokerHands);
        } else {
            System.out.println("Poker Hands not found");
        }
    }

    // Removing an item from the Set
    public void removePokerHands(String pokerHands) {
        if (this.pokerHands.contains(pokerHands)) {
            this.pokerHands.remove(pokerHands);
        } else {
            System.out.println("Poker Hands not found");
        }
    }
}