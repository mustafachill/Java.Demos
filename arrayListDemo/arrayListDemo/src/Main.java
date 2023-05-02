import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        ArrayList sayilar = new ArrayList();
        sayilar.add(1);
        sayilar.add(10);
        sayilar.add("Ankara");
        Collections.sort(sayilar);
        for(Object i : sayilar){
            System.out.println(i);
        }
    }
}