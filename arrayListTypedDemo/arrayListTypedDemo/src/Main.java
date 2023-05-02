import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> sehirler = new ArrayList<>();
        sehirler.add("Balıkesir");
        sehirler.add("Texas");
        sehirler.add("Elazığ");
        //sehirler.remove("Balıkesir");
        Collections.sort(sehirler);
        for (String i : sehirler){
            System.out.println(i);
        }

    }
}