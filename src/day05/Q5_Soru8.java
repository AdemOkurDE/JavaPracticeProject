package day05;

import java.util.Scanner;

public class Q5_Soru8 {
    public static void main(String[] args) {
        /*
         * Ask user Name, Surname and credit card numbers than convert it to special
         * form
         *
         * (Check credit card number, if there aren’t 16 digit print
         * “Invalid credit card number”
         *
         * Input : John White 1234234534561478
         * Output : Name : J*** W****
         *          CCN  : **** **** **** 1478
         *  (Initials for name and surname should be uppercase)

         * TR:
          * Kullanıcıya Ad, Soyad ve kredi kartı numaralarını sorun, özel biçime çevirin:
          *
          * (Kredi kartı numarasıni kontrol edin, 16 haneli değilse:
          * "Geçersiz kredi kartı numarası" yazdirin
          *
          * Girdi: John White 1234234534561478
          * Çıktı : Ad : J*** W****
          * CCN : **** **** **** 1478
          * (Ad ve soyadın baş harfleri büyük olmalıdır)

           ChatGPT tercumesi :
         * Kullanıcıdan ad, soyad ve kredi kartı numarasını isteyen
         * ve belirli bir formatta çıktı üreten bir Java kodu yazmanız isteniyor.
         * Eğer kredi kartı numarası 16 haneli değilse "Geçersiz kredi kartı numarası" yazdırılması gerekiyor.
         * Örnek girdi ve çıktılar da aşağıdaki gibidir:

        Girdi: John White 1234234534561478

        Çıktı:
                Ad: J*** W****
                KKN: **** **** **** 1478
         * */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen adinizi girin: ");
        String ad = scanner.next().toUpperCase().trim();

        System.out.print("Lütfen soyadinizi girin: ");
        String soyad = scanner.next().toUpperCase().trim();

        System.out.print("Lütfen 16 haneli Kredi Kart numaranizi girin: ");
        String kartNo = scanner.next();

        if (kartNo.length()!=16){
            System.out.println("Geçersiz kredi kartı numarası");
        }else {
            String adGizli=ad.substring(0,1);
            String soyadGizli=soyad.substring(0,1);
            for (int i = 0; i < ad.length()-1; i++) {
                adGizli+="*";
            }
            for (int i = 0; i <soyad.length()-1 ; i++) {
                soyadGizli+="*";
            }
            System.out.println("\nAd : " + adGizli + " "+ soyadGizli);

            System.out.println("Kredi Kart No : "+"**** **** **** " + kartNo.substring(12));
        }

        //ChatGPT :
        // Kullanıcıdan ad, soyad ve kredi kartı numarasını alın
        System.out.print("Adınızı girin: ");
        String name = scanner.next();
        System.out.print("Soyadınızı girin: ");
        String surname = scanner.next();
        System.out.print("Kredi kartı numaranızı girin: ");
        String creditCardNumber = scanner.next();

        // Kredi kartı numarasının 16 haneli olup olmadığını kontrol edin
        if (creditCardNumber.length() != 16) {
            System.out.println("Geçersiz kredi kartı numarası");
            return;
        }

        // Ad ve soyadın baş harflerini büyük harf yapın
        String maskedName = name.substring(0, 1).toUpperCase() + "*".repeat(name.length() - 1) + " " +
                surname.substring(0, 1).toUpperCase() + "*".repeat(surname.length() - 1);

        // Kredi kartı numarasının son 4 hanesini ayrı bir değişkene kaydedin
        String last4Digits = creditCardNumber.substring(12);

        // Kredi kartı numarasının ilk 12 hanesini asterisk karakterleriyle değiştirin
        String maskedCreditCardNumber = "**** **** **** " + last4Digits;

        // Sonuçları yazdırın
        System.out.println("Ad: " + maskedName);
        System.out.println("Kredi kartı numarası: " + maskedCreditCardNumber);

    }
}
