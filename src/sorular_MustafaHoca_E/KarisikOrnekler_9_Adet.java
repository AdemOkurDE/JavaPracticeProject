package sorular_MustafaHoca_E;

import java.util.Scanner;

public class KarisikOrnekler_9_Adet {
    public static void main(String[] args) {

        //1-
/*
    1 den 20 ye kadar tam sayıları alt alta yazan Java kodu yazınız.
    Hint: For döngüsü kullanınız.
    Beklenen Çıktı:
    1
    2
    3
    4
    .
    .
    .
    19
    20
    */
        // 2-
/*
    Sayinin Sayi degerlerinin toplamasini yapan Java kodu yaziniz.
    Test Data
    34
    Beklenen Cikti
    7
    */
//      int sayi=54;
//      int birlerBasamak=sayi%10;
//      int onlarBasamak= sayi/=10;
//        System.out.println(birlerBasamak+onlarBasamak);
//
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Sayi giriniz : ");
//        int girilenSayi=scanner.nextInt();
//
//        int sayiRakamlarToplami=0;
//
//        while (girilenSayi>0){
//            sayiRakamlarToplami=sayiRakamlarToplami+girilenSayi%10;
//            girilenSayi=girilenSayi/10;
//
//        }
//        System.out.println("Girilen sayinin rakamlar toplami = " +sayiRakamlarToplami);


        // 3-
/*
    Belirlenen sayının 1 den 10 a kadar çarpım sonuçlarını yapan Java programını yazınız.
    Örnek Sonuç:
    5 x 1 = 5
    5 x 2 = 10
    5 x 3 = 15
    5 x 4 = 20
    5 x 5 = 25
    5 x 6 = 30
    5 x 7 = 35
    5 x 8 = 40
    5 x 9 = 45
    5 x 10 = 50
    */

    /*
    int sayi = 7;

        int sayac = 1;

        for (int i = 1; i <= 10; i++) {
            sayac++;
            System.out.println((sayi + " * " + i + "\t=  " + sayi * i + ""));
        }
    */
        //   4-
/*
    1 den 10 a kadar her satırda bir artırarak aşağıdaki şekli oluşturan Java kodunu yazınız.
     Beklenen çıltı:
    1
    12
    123
    1234
    12345
    123456
    1234567
    12345678
    123456789
    12345678910
    */

//        for (int i = 1; i <=10 ; i++) {
//
//            for (int j = 1; j <=i; j++) {
//                System.out.print(j);
//            }
//            System.out.println("");
//
//        }

        //   5-
/*
    Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
    değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
    1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada
    küçüklüğüne duyarlıdır.)
    Sesli harfler: a,e,i,o,u
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

//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Lütfen bir harf giriniz :");
//        String str= scanner.nextLine();
//        char harf =str.charAt(0);
//        boolean hata1=str.length()>1;
//        boolean hata2=((harf>='a' && harf<='z')||(harf>='A' && harf<='Z'));
//
//        if (hata1||!hata2){
//            System.out.println("Hatali Giris!");
//
//        } else {
//            switch (harf){
//                case 'a':;
//                case 'A':;
//                case 'e':;
//                case 'E':;
//                case 'i':;
//                case 'I':;
//                case 'o':;
//                case 'O':;
//                case 'u':;
//                case 'U':
//                    System.out.println("Sesli Harf");
//                    break;
//                default:
//                    System.out.println("Sessiz harf!");
//
//        }
//
//        }

        //   6-
/*
    Ugly Number:
    Girilen bir sayının  ugly number olup olmadığını kontrol etmek için bir Java programı yazın.
    Sayı sisteminde,  ugly number  sadece asal faktörleri carpanlari 2, 3 veya 5 olan pozitif sayılardan olusur...
    İlk 10  ugly number 1, 2, 3, 4, 5, 6, 8, 9, 10, 12'dir. Kural olarak, 1 dahil.
    Test Data:
    13
    Beklenen çıktı:
    ugly number  degildir
    Test Data:
    25
    Beklenen Çıktı:
    ugly number
    */

//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Sayi giriniz : ");
//        int sayi= scanner.nextInt();
//        if (sayi>0&&sayi<7){
//            System.out.println("Sayi UGLY");
//        }else {
//            while (sayi>=7){
//                if (sayi%2==0){
//                    sayi/=2;
//                    if (sayi<7) System.out.println("Sayi UGLY");
//                }else if (sayi%3==0){
//                    sayi /=3;
//                    if (sayi<7) System.out.println("Sayi UGLY");
//                } else if (sayi%5==0) {
//                    sayi /=5;
//                    if (sayi<7) System.out.println("Sayi UGLY");
//
//                }else {
//                    System.out.println("Sayi UGLY Degil!");
//                    break;
//                }
//
//            }
//
//        }


        //  7-
/*
    2 farklı String'i  ucuca ekleyen Java Kodunu yazınız (with StringConcat
    Test Data:
    str1: Java is
    str2: fun
    Beklenen Çıktı:
    java is fun
    */
//        String str1="Java is";
//        String str2="fun";
//        String str3=str1.concat(" "+str2);
//        System.out.println(str3);


        //   8-
/*
    Kullanıcıdan alınan String kümesi içerisinde aranan String i bulan Java Kodunu yazınız.
    Test Data:
    Java is easy
    Aranan String: is
    Bektenen Çıktı:
    True
    Aranan String: and
    Beklenen Çıktı:False
    */


//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Lütfen bir metin giriniz : ");
//        String str=scanner.nextLine();
//        System.out.println("Aranan metni giriniz : ");
//        String aranan=scanner.nextLine();
//        System.out.println("Girdiginiz metin "+aranan+" metnini "+ (str.contains(aranan)?"Icerir":"Icermez"));

    /*        9-
        */
    /*
    Kullanıcının girdiği String değerlerini büyük harfe çeviren Java kodunu yazınız.
    Test Data:
    Java is fun
    Beklenen Sonuç:
    JAVA IS FUN
    */

//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Lütfen bir metin giriniz : ");
//        String str= scanner.nextLine().toUpperCase();
//        System.out.println(str);


    }
}
