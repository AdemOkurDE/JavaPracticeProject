package sorular_MustafaHoca_B;

import java.util.Scanner;

public class Sorular_8_Adet {
    public static void main(String[] args) {



        /* 1-

         * Ask user to their weight and height and type a program with calculates mass
         * index
         * HINT : Body Mass Index = Weight (kg) / Square of height (m) Then give a
         * message to user as following:
         * If BMI is less than 18.5 , you re weak If BMI is between 18.5 and 25 , your
         * weight is ideal If BMI is between 25 and 30, you re fat If BMI is more than
         * or equal to 30, obese
         * EXAMPLE :
         * INPUT:
         * Weight : 71
         * Height : 1,72
         *
         * OUTPUT :
         * Your BMI is : 23.99945916711736 Your weight is ideal
         */

        /* 2-

         * Ask user Name, Surname and credit card numbers than convert it to special
         * form. (Initials for name and surname should be uppercase) (Check credit card
         * number, if there aren’t 16 digit print “Invalid credit card number”
         * Input :
         * John White 1234234534561478
         * Output :
         * Name : J* W**
         * CCN : ** ** **** 1478
         */

        /* 3-

         * Write a Java program to compute and print sum of two given numbers (more than
         * or equal to zero).
         *
         * If given integers or the sum have more than 10 digits, print "overflow".
         *
         * EXAMPLE:
         *
         * INPUT : Input two integers:
         * 25
         * 46
         *
         * OUTPUT :
         * Sum of the numbers: 71
         */

        /* Verilen iki sayının toplamını hesaplayan ve yazdıran bir Java programı yazın (birden fazla
         * veya sıfıra eşit).
         *
         * Verilen tamsayılar veya toplam 10 basamaktan fazlaysa "taşma" yazdırın.
         *
         * ÖRNEK:
         *
         * GİRİŞ : İki tamsayı girin:
         * 25
         * 46
         *
         * ÇIKTI :
         * Sayıların toplamı: 71
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen iki tamsayi girin :");
        int sayi1= scanner.nextInt();
        int sayi2= scanner.nextInt();
        int toplam=sayi1+sayi2;

        if (sayi1>999999999||sayi2>999999999||toplam>999999999){
            System.out.println("Tasma var!!");
        }else {
            System.out.println("Sayilarin toplami :" +(sayi1+sayi2));
        }


        /*
        4-
         * Write a switch statement that tests the value of the char variable response
         * and performs the following actions:
         *
         * if response is a, the message Your request is being processed is printed
         *
         * if response is b, the message Thank you anyway for your consideration is
         * printed
         *
         * if response is c, the message Sorry, no help is currently available is
         * printed for any other value of response, the message
         * "Invalid entry, please try again!" is printed
         *
         * Create Scanner object.
         *
         * Use charAt() method, in order to get the char value at the specified index.
         *
         * Example:
         *
         * -Display prompt: "Enter command:"
         *
         * input: a -Display prompt: "Your request is being processed"
         */

        /*
         * Char değişken yanıtının değerini test eden bir switch ifadesi yazın
         * ve aşağıdaki eylemleri gerçekleştirir:
         *
         * cevap a ise talebiniz işleniyor mesajı yazdırılır
         *
         * yanıt b ise, İlginiz için yine de teşekkür ederiz mesajı
         * basılı
         *
         * yanıt c ise Üzgünüm, şu anda hiçbir yardım mevcut değil mesajı
         * diğer herhangi bir yanıt değeri için yazdırılır, mesaj
         * "Geçersiz giriş, lütfen tekrar deneyin!" yazdırılır
         *
         * Tarayıcı nesnesi oluşturun.
         *
         * Belirtilen dizinde char değerini almak için charAt() yöntemini kullanın.
         *
         * Örnek:
         *
         * -Ekran istemi: "Komutu girin:"
         *
         * giriş: a -Görüntü istemi: "İsteğiniz işleniyor"

         */


        /* 5-

         * Write a Java program to find the number of days in a month.(Use Switch Case)
         * (Interview Question / Leak Year)
         *
         * Sample: ​ INPUT: ​ Input a month number: 2 ​ Input a year: 2016 ​ OUTPUT : ​
         * February 2016 has 29 days
         */


        /*  6-

         * Ask user to type a name,
         *
         * the length of name should be 3.
         *
         * Then check if the name has same characters.
         *
         * If the String has same characters
         *
         * Print “String has duplicate characters” Else
         *
         * Print “String has unique characters”
         *
         * Please use ternary.
         *
         * Input :
         *
         * ala
         *
         * OutPut:
         *
         * String has duplicate characters
         */

        /*  7-

         * Create 2 words : name1 and name2
         *
         * if the name1 has even numbers of characters,
         *
         * then insert the second word in the middle of the first name
         *
         * if the first word has odd numbers
         *
         * Then print the “Name2 cannot be inserted in the name1”
         *
         * e.g:
         *
         * name1= mehmet
         *
         * name2= ahmet
         *
         * Print ==> mehahmetmet

         TR:

         * 2 kelime oluşturun: ad1 ve ad2
          *
          * ad1 çift sayıda karakter içeriyorsa,
          *
          * sonra ikinci kelimeyi ilk ismin ortasına ekleyin
          *
          * ilk kelime tek sayıda karater varsa
          *
          * Ardından “ad2, ad1'e eklenemez” yazdırın
          *
          * Örneğin:
          *
          * ad1= mehmet
          *
          * ad2= ahmet
          *
          * Yazdır ==> mehahmetmet
         */

        /*       8 -

         * Kullanıcıdan bir isim girmesini isteyin ve son 2 harfinin 3 kopyasından
         * oluşan yeni bir String yazdırın
         *
         * Kullanicidan alinan isim uzunluğu en az 2 olacaktır.
         *
         * INPUT : Mustafa
         *
         * OUTPUT : fafafa
         */

    }
}