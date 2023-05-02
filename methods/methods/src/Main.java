public class Main {
    public static void main(String[] args) {
        sayiBulmaca();

    }

    public static void sayiBulmaca() {
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 8;
        boolean varmi = false;

        for (int sayi : sayilar) {
            if (aranacak == sayi) {
                varmi = true;
                break;
            }
        }
        String mesaj = "" ;
        if (varmi == true) {
            mesaj = "Sayı mevcuttur: " + aranacak;
            mesajVer(mesaj);

        } else {
            mesajVer("Sayı mevcut değildir: "+ aranacak );

        }
    }

    public static void mesajVer(String mesaj) {
        System.out.println(mesaj);

    }

}