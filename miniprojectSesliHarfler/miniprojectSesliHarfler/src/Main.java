public class Main {
    public static void main(String[] args) {

        char girdi = 'A';
        char[] kalinharf = {'A', 'O', 'U', 'I'};
        char[] inceharf = {'E', 'Ö', 'Ü', 'İ'};
        boolean kontrol = false;
        for (int i = 0; i < kalinharf.length; i++) {
            if (kalinharf[i]== girdi){
                kontrol = true;
                break;
            }
        }
        for (int i = 0; i < inceharf.length; i++) {
            if (inceharf[i] == girdi){
                kontrol = false;
                break;
            }
        }
        if (kontrol){
            System.out.println("kalın harf");
        }
        else {
            System.out.println("ince harf");
        }

        }
    }
