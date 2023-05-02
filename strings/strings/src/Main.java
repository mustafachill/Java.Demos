public class Main {
    public static void main(String[] args) {/*
        String mesaj = "Senii çok seviyorum elifim,";
        System.out.println(mesaj);
        System.out.println("karakter sayısı :" +mesaj.length());
        System.out.println("5. eleman :" + mesaj.charAt(3));
        System.out.println(mesaj.concat(" iyi ki varsın<3"));
        String mesaj2 = mesaj.concat(" iyi ki varsın<3");
        System.out.println(mesaj2);
        System.out.println(mesaj.startsWith("A"));
        System.out.println(mesaj.endsWith(","));
        char[] karakterler = new char[5];
        mesaj.getChars(0, 5,karakterler, 0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("e"));
        System.out.println(mesaj.lastIndexOf("e"));*/
        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);
        String yenimesaj = mesaj.replace("B", "P");
        System.out.println(yenimesaj);
        System.out.println(mesaj.substring(1,3));
        for (String kelime : mesaj.split(" ")) {
            System.out.println(kelime);
        }




    }
}