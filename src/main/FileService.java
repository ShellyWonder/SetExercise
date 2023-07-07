package main;
import java.io.File;
import java.util.HashSet;
import java.util.Set;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileService {
    private File file;
    private HashSet<PokerHand> pokerHands;

    public FileService() {
        Path path = Paths.get("PokerHands.csv");
        if (path.toFile().exists()) {
            this.pokerHands = new HashSet<PokerHand>();
            Set<String> pokerHands = new HashSet<String>();
        } else {
            System.out.println("File not found");
        }
        
    }
}


