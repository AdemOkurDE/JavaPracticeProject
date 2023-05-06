package dayMayis_05;

import java.util.Random;
import java.util.Scanner;
public class TasKagitMakasAdm01 {
    /*
        Bilgisayara karsi tas kagit makas oyunu oynayacağımız kodları yazınız
        Kural: 5 puana ilk ulasan oyunu kazanir. adini yazdir.
     */
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int pcPuan = 0;
        int userPuan = 0;

        while (pcPuan < 5 && userPuan < 5) {

            String kazananOyuncu = "";
            kazananOyuncu = oynat();  // B, P, U harflerinden biri gelir.

            if (kazananOyuncu.equals("B")) {
                System.out.println("Oyun berabere, devam edin. Durum: PC:"+pcPuan+" / User:"+userPuan);
            } else if (kazananOyuncu.equals("P")) {

                pcPuan++;
                System.out.println("PC kazandi. Durum: PC:"+pcPuan+" / User:"+userPuan );
            } else if (kazananOyuncu.equals("U")) {

                userPuan++;
                System.out.println("Siz kazandiniz. Durum: PC:"+pcPuan+" / User:"+userPuan);
            }
        }

        if (pcPuan < userPuan) {
            System.out.println("Oyunu Siz kazandiniz!");
        } else {
            System.out.println("Oyunu PC kazandi");
        }

        System.err.println("Oyun Bitti!");
    }
    public static String oynat() {
        String kazanan = ""; // kazanan icin bir degisken( B , P , U) B:Berabere   P:PC    U:User
        String durum = ""; // PC ve User durumu  : TT, TK, TM ,MM,MT,MK,KK, KM,KT gibi

        int pcSayi = 0;  // PC sayisini uretelim random ile 1-3 arasi 1:Tas 2:Kagit 3:Makas
        Random rnd = new Random();
        pcSayi = rnd.nextInt(3) + 1;

        durum = harfUret(pcSayi); // T, K, M

        // user sayisini isteyelim:1:Tas 2:Kagit 3:Makas
        System.out.println("Lutfen bir sayi giriniz:\n1:Tas 2:Kagit 3:Makas");

        int userSayi = scanner.nextInt();

        if (userSayi < 1 || userSayi > 3) {
            System.out.println("Gecersiz giris, lutfen yeniden giriniz!");
            oynat();
        }
        durum += harfUret(userSayi); // T, K,M

        //kazanani bulalim ( B , P , U) B:Berabere   P:PC    U:User
        switch (durum) {
            case "TT":   case "KK":  case "MM":   kazanan = "B";
                System.out.println("PC :"+yaziUret(pcSayi)+ " User :" + yaziUret(userSayi));
                break;
            case "TM":  case "KT":   case "MK":    kazanan = "P";
                System.out.println("PC :"+yaziUret(pcSayi)+ " User :" + yaziUret(userSayi));
                break;
            case "TK":   case "KM":    case "MT":
                kazanan = "U";
                System.out.println("PC :"+yaziUret(pcSayi)+ " User :" + yaziUret(userSayi));
                break;
        }

        return kazanan;
    }
    public static String harfUret(int sayi) {
        String harf = "";
        switch (sayi) {
            case 1: harf = "T";  break;
            case 2: harf = "K";  break;
            case 3: harf = "M";  break;
        }
        return harf;
    }
    public static String yaziUret(int sayi) {
        String secim = "";
        switch (sayi) {
            case 1: secim = "Tas"; break;
            case 2: secim = "Kagit"; break;
            case 3: secim = "Makas"; break;
        }
        return secim;
    }

}
