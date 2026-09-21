package UkolVezni;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class SpravaVeznu {
    String path = "Vezni.txt";
    List<String> radky = new ArrayList<>();



    public SpravaVeznu() {
    }





    public void nacteniRadku(){
        try {
            radky = Files.readAllLines(Paths.get(path));
        } catch (IOException e) {
            System.err.println("Chyba při čtení souboru: " + e.getMessage());
        }
    }

    public void validaceRadku(){

    }

    public void zapsatVezne(){

    }

    public void vypsatVezne(){

    }






































}
