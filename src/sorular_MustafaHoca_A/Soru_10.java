package sorular_MustafaHoca_A;

import java.util.Scanner;

public class Soru_10 {

    public static void main(String[] args) {

        /*        10-

         * Kullanıcıdan aldığınız  Adı, Soyadı ve kredi kartı numaralarını
         aşağıdaki gibi özel forma dönüştürün
         * Kredi kartı numarasını kontrol edin,
         yoksa ve 16 haneden küçük olursa   "Geçersiz kredi kartı numarası" yazdırın.
         * input : John White 1234234534561478
           output: Ad : J*** Soyad :W**** kartNo:***********1478
           (Adın baş harfleri ve soyadı büyük olmalıdır)
         */

       Scanner scanner =new Scanner(System.in);
        System.out.println("Lütfen ad soyad ve kredi kart numaranizi aralarinda bosluk olack sekilde giriniz : ");
        String giris= scanner.nextLine();
        giris=giris.trim();
        String ad=giris.substring(0,giris.indexOf(" "));
        String soyad=giris.substring(giris.indexOf(" ")+1,giris.lastIndexOf(" "));
        String kartno=giris.substring(giris.lastIndexOf(" ")+1);

        if (kartno.length()>16||kartno.length()<16){
            System.out.println("Geçersiz kredi kartı numarası");
        }else {

            String adKalan=ad.substring(1);
            adKalan=adKalan.replaceAll("\\w","*");
            System.out.print("Ad : " +ad.substring(0,1).toUpperCase()+adKalan);

            String soyadKalan=soyad.substring(1);
            soyadKalan=soyadKalan.replaceAll("\\w","*");
            System.out.print("  Soyad : " + soyad.substring(0,1).toUpperCase()+soyadKalan);

            System.out.print("  Kart No : ************" + kartno.substring(12));
        }

    }
}
