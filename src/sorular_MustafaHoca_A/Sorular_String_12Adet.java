package sorular_MustafaHoca_A;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Sorular_String_12Adet {
    public static void main(String[] args) {
        //1-
        // Kullanıcıdan alacağını bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Lütfen bir metin giriniz : ");
//        String metin = scanner.nextLine();
//        System.out.println(metin.contains(" "));
//        if (metin.contains(" ")) {
//            System.out.println("Girdiginiz metin bosluk iceriyor");
//        } else System.out.println("Girdiginiz metin bosluk icermiyor!!");



    /*




 2-
        // Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
        // ad ayrı soyad ayrı sekilde ekrana yazdırınız.
        */
//        int boslukIndex = -1;
//        System.out.println("Lütfen isminizi arada bosluk olacak sekilde giriniz : ");
//        String isim = scanner.nextLine();
//        boslukIndex = isim.indexOf(" ");
//        String ad = isim.substring(0, boslukIndex);
//        String soyad = isim.substring(boslukIndex + 1);
//        System.out.println("Adiniz : " + ad + "\nSoyadiniz : " + soyad);

        /*
 3-
        //Kullanıcıdan alacağınız, 3 kelimeden oluşan ismi
        // Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.*/
//        System.out.println("Lütfen üc kelimelik adinizi aralarinda bosluk olacak sekilde yaziniz :");
//        String ucIsim = scanner.nextLine();
//        String ilkHarf = ucIsim.substring(0, 1).toUpperCase();
//        String ikinciHarf = ucIsim.substring(ucIsim.indexOf(" ") + 1, ucIsim.indexOf(" ") + 2).toUpperCase();
//        String ucuncuharf = ucIsim.substring(ucIsim.lastIndexOf(" ") + 1, ucIsim.lastIndexOf(" ") + 2).toUpperCase();
//        System.out.println(ilkHarf + "." + ikinciHarf + "." + ucuncuharf + ".");



/*4-
        // Kullanicidan 4 harfli bir kelime isteyin
        // ve girilen kelimeyi tersten yazdirin
        */

//        Scanner scanner1 = new Scanner(System.in);
//        System.out.println("Lütfen 4 harfli bir kelime giriniz : ");
//        String str = scanner1.nextLine();
//
//        str = str.substring(3) + str.substring(2, 3) + str.substring(1, 2) + str.substring(0, 1);
//        System.out.println(str);

    /*
5-

        String seklinde verilen asagidaki fiyatlarin toplamini bulunuz.
        String  str 1= %13.99
        String str 2= %10.55
        ipucu: Double.parseDouble() methodunu kullanabilirsiniz.
        */

//        String str1 = "%13.99";
//        String str2 = "%10.55";
//
//        Double birinciSayi = Double.parseDouble(str1.substring(1));
//        Double ikinciSayi = Double.parseDouble(str2.substring(1));
//        Double db = Double.parseDouble(str1.substring(1)) + Double.parseDouble(str2.substring(1));
//
//        System.out.println(str1 + " + " + str2 + " Sayilarinin toplami : % " + db);
//        System.out.println(birinciSayi + " + " + ikinciSayi + " Toplami = % " + (birinciSayi + ikinciSayi));


    /*

        6 -

       kullanıcıdan bir e-posta adresi girmesini isteyin, ardından "hotmail" içeriyorsa, "gmail" ile değiştirin,
        örneğin: johnbrown@hotmail.com ==> johnbrown@gmail.com
        */
//        Scanner scanner2 = new Scanner(System.in);
//        System.out.println("Lütfen e-mail adresinizi yaziniz : ");
//        String email = scanner2.nextLine();
//        email = email.replace("hotmail", "gmail");
//        System.out.println(email);



        /*   7-

         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */

//        Scanner scanner3 = new Scanner(System.in);
//        System.out.println("Lutfen uc harfli bir isim giriniz :");
//        String name = scanner3.nextLine();
//
//
//        System.out.println(name.substring(1).contains(name.substring(0, 1)) ||
//                name.substring(2).contains(name.substring(1, 2))
//                ?
//                "Harfler farkli degil"
//                :
//                "Harfler birbirinden farkli"
//
//        );






         /*
         8-

          Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
         * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
         *
                 * ornek
         * input = Ali
         * output = lilili
         *
                 * input = el
         * output = el
         */


//        Scanner scanner4 = new Scanner(System.in);
//        System.out.println("Lütfen bir kelime giriniz : ");
//        String kelime = scanner4.nextLine();
//
//        if (kelime.length() >= 3) {
//            String sonHece = (kelime.substring(kelime.length() - 2));
//            System.out.println(sonHece + sonHece + sonHece);
//
//        } else {
//            System.out.println(kelime);
//
//        }

         /*        9-

                StringMethods:
                cift uzunlukta bir degiskenin ilk yarisini konsolda yazdirmak icin bir Java programi yaziniz.
                ORNEK:
                INPUT      :  Python
                OUTPUT :   Pyt
        */

        

        /*        10-

         * Kullanıcıdan aldığınız  Adı, Soyadı ve kredi kartı numaralarını aşağıdaki gibi özel forma dönüştürün
         * Kredi kartı numarasını kontrol edin, yoksa 16 haneden küçük olursa   "Geçersiz kredi kartı numarası" yazdırın.
         * input : John White 1234234534561478
           output: Ad : J*** Soyad :W**** kartNo:***********1478 (Adın baş harfleri ve soyadı büyük olmalıdır)
         */
         /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
         1) \\d    ==> tum rakamlar         0->9
             \\D    ==> tum rakam disi character ler  0->9    _ disindaki hersey
         2) \\w   ==> A->Z        a->z
             \\W  ==> A->Z        a->z     tum harf disi character ler
         3) \\s   ==> space
             \\S   ==> space disindaki hersey
     */

        /*         11-

        Asagidaki String degiskenini kullanarak  konsolda A L i yazdiriniz.
        String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
         */
//        String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//        System.out.println(pickName.substring(0,1)+" "+pickName.substring(11,12)+" "+pickName.substring(8,9).toLowerCase());
         /*        12-

        Kullanicidan email girmesini isteyin
       @ isareti icermiyorsa "gecerli bir email girin" yazdirin
       @ isaretinden sonra sadece "gmail.com" yaziyorsa "email onaylandi" yazdirin
       @ isaretinden sonra "gmail.com" disinda birsey yaziyorsa "Lutfen gmail hesabinizi girin" yazdirin
       ORNEK:
       INPUT : wisequarter.com OUTPUT : "gecerli bir email girin "
       INPUT : wisequarter@gmail.com OUTPUT :  "email onaylandi "
       INPUT : wisequarter@hotmail.com OUTPUT : "Lutfen gmail hesabinizi girin"
       */


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir email adresi giriniz :");
        String email= scanner.nextLine();

        if (!email.contains("@")){
            System.out.println("gecerli bir email girin");
        } else if (email.substring(email.indexOf("@")+1).contains("gmail.com")) {
            System.out.println("email onaylandi");
        }else {
            System.out.println("Lutfen gmail hesabinizi girin");
        }

    }
}
