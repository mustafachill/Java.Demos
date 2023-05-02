public class Main {
    public static void main(String[] args) {
        String[][] sehirler= new String[3][3];

        sehirler [0][0] = "İSTANBUL";
        sehirler [0][1] = "BURSA";
        sehirler [0][2] = "BİLECİK";
        sehirler [1][0] = "ANKARA";
        sehirler [1][1] = "KONYA";
        sehirler [1][2] = "KAYSERİ";
        sehirler [2][0] = "DİYARBAKIR";
        sehirler [2][1] = "URFA";
        sehirler [2][2] = "ANTEP";

        for (int i = 0; i<=2; i++) {
            System.out.println("-----------------------");
            for (int j=0;j<=2;j++) {
                System.out.println(sehirler[i][j]);
            }
        }

    }
}