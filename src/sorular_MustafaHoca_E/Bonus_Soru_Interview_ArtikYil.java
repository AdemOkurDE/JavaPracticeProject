package sorular_MustafaHoca_E;

import java.util.Scanner;

public class Bonus_Soru_Interview_ArtikYil {

    /*
    Kullanıcı tarafından girilen bir yılın  artık yıl olup
    olmadığını kontrol etmek için bir Java Methodu yazınız.
    Test Data:
    2017
    Beklenen Çıktı:
    false
    */
    /*
    NormalCözüm:
    public class LeapYearExample {
public static void main(String[] args) {
    int year=2020;
    if(((year % 4 ==0) && (year % 100 !=0)) || (year % 400==0)){
        System.out.println("LEAP YEAR");
    }
    else{
        System.out.println("COMMON YEAR");
    }
}
}
     */

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen Artik mi diye kontrol edeceginiz Yili giriniz : ");
        int yil = scanner.nextInt();

        if (artikYilMi(yil)){
            System.out.println(yil +" yili Artik Yildir!");
        }else System.out.println(yil + " yili Artik Yil degildir!");

    }
public static boolean artikYilMi(int sayi){
    boolean artikMi=false;

    if (sayi%4==0){
        artikMi=true;
    }
    return artikMi;
}
}
