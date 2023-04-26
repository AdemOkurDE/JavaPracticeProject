package dayNisan_26_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q2_MuratBey {

    /*
    Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
    değilse sessiz harf olduğunu ekrana yazdıran bir method olusturun. Girdiği değer
    1 karakterden fazla ise hata mesajı göstersin ve islemi basa alsin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
    Sesli harfler: a,e,i,o,u
    sessiz harfler: b, c, d, f, g,  h, j, k, l, m, n, p, q, r, s, t, v, w, y, z
    Test Data:
    a
    Beklenen Çıktı:
    a harfi sesli harfdir.
    Test Data:
    d
    Beklenen Çıktı:
    d harfi sesiz harftir.
    Test Data:
    we  yada %
    Beklenen Çıktı:
    Yanlis karakter girdiniz!
     */

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        sesliSessizBelirtme();
    }

    public static void sesliSessizBelirtme() {
        System.out.println("harf giriniz: ");
        String kullaniciHarfGirisi = scanner.nextLine();
        String harfIgnore=kullaniciHarfGirisi.toLowerCase(); // buyuk kucuk her iki harfi de test icin kullanildi.
        // kullanicinin girdigi harfi aynen gostermek icin ayri bir degisken yapildi.

        boolean karakterBulunamadi=true; // eger tek karakter girildigi halde harf degilse
        // Nested If ile bu variable kullanarak mesaj vermek icin tanimlandi.(2. for cikisi)


        ArrayList<String> sesliHarfler = new ArrayList<>(Arrays.asList("a", "e", "i", "o", "u"));
        ArrayList<String> sessizHarfler = new ArrayList<>(Arrays.asList("b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t" , "v" , "w" , "y" , "z")); //q,v,w, harfleri eklendi

        if ( kullaniciHarfGirisi.length() == 1  ) {
            for (int i = 0; i < sessizHarfler.size(); i++) {
                if (sessizHarfler.get(i).equals(harfIgnore)) {
                    System.out.println(kullaniciHarfGirisi + " harfi sessiz harftir.");
                    karakterBulunamadi=false;
                    break;
                }
            }
            for (int i = 0; i <sesliHarfler.size() ; i++) {
                if (sesliHarfler.get(i).equals(harfIgnore)) {
                    System.out.println(kullaniciHarfGirisi + " harfi sesli harfdir.");
                    karakterBulunamadi=false;
                    break;
                }
            }

            if (karakterBulunamadi){ // tek karakter girildi ancak karakter iki listede de bulunamadi.
                // Nested if ile "Yanlis karakter" mesaji verilecek!

                System.out.println("Yanlis karakter girdiniz! Tekrar girin!");
                sesliSessizBelirtme();
            }

        } else {        // ilk if sonucu false ise birden fazla karakter girildi mesaji verilecek!

            System.out.println("Fazla karakter girdiniz! Tekrar girin!");
            sesliSessizBelirtme();

        }

    }



}