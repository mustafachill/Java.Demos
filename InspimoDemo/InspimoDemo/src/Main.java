import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner klavye = new Scanner(System.in);

        Dikdortgen dikdortgen = new Dikdortgen();
        dikdortgen.uzunKenar = klavye.nextDouble();
        dikdortgen.kisaKenar = klavye.nextDouble();
        dikdortgen.alanHesapla();
        dikdortgen.cevreHesapla();
    }
}