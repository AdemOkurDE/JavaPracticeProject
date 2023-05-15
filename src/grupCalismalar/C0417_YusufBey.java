package grupCalismalar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C0417_YusufBey {

    public static void main(String[] args) {

        /* kullanicidan alinan deger 0 olana kadar;
            * cift sayilari toplayan
            * tek sayilari cikaran
            * 0 girilince toplami ekrana yazdirin
         */

        Scanner scanner =new Scanner(System.in);
        int girilenSayi=1;
        int toplam=0;

//        List<String> sayilar= new ArrayList<>();
        List<Integer> sayilar =new ArrayList<>();
        
        while (girilenSayi!=0){
            System.out.println("Lutfen bir sayi giriniz : ");
            girilenSayi=scanner.nextInt();
//            String sayi;
            int sayi;
            if (girilenSayi%2==0){ // sayi cift ise toplamaya ekleyelim, ayrica listeye + sayi(STRING) olarak
                toplam+=girilenSayi;
//                sayi="+"+girilenSayi;
                sayi=girilenSayi;

            }else {
                toplam-=girilenSayi;
//                sayi="-"+girilenSayi;
                sayi=girilenSayi*(-1);
            }
            if (girilenSayi!=0){ // sayo 0 olunca listeye eklemesini onleyelim;
                sayilar.add(sayi);
            }
        }
        System.out.print(sayilar+"Sayilarinin");
        System.out.print(" toplami : " + toplam);

    }
}
