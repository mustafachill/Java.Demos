import matematik.*;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int sayi = scanner.nextInt();
        System.out.println("Girilen sayı: "+sayi);

        DortIslem dortIslem = new DortIslem();
        dortIslem.topla(2,7);
        Logaritma logaritma = new Logaritma();
    }
}