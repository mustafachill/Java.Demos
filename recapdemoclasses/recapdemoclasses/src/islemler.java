import javax.naming.NameNotFoundException;

public class islemler {
    public int topla (int sayi1, int sayi2) {
        return sayi1+sayi2;
    }
    public int cikar (int sayi1, int sayi2) {
        return sayi1-sayi2;
    }
    public int carp (int sayi1, int sayi2) {
        return sayi1*sayi2;
    }
    public int bol (int sayi1, int sayi2) {
        if (sayi2!=0) {
        return sayi1/sayi2;
        }
        else {
            System.out.println("Payda 0 Olamaz!");
            return -999999;
        }
    }
}
