public class Dikdortgen {
    double uzunKenar;
    double kisaKenar;
    public void alanHesapla(){
        double alan = kisaKenar*uzunKenar;
        System.out.println(alan);

    }

    public void cevreHesapla(){
        double cevre= kisaKenar*2+uzunKenar*2;
        System.out.println(cevre);
    }
}
