package dayMayis_05;

import java.util.Scanner;

public class AdamAsmaca {

    /*
                 -------ADAM ASMACA OYUNU --------
        Kullanıcı, tahmin etmek istediği harfleri girebilir. Tahmin edilen harfler,
        kelimenin doğru harfleriyle yer değiştirilir ve kalan hak sayısı tutulur.
        Tahmin edilen kelimenin her aşaması ekrana yazdırılır.
        Kullanıcının tahmin hakkı bittiğinde, doğru kelime ekrana yazdırılır

        Bu programda, kelimeler adlı bir kelime listesi oluşturulacak.
        Ardından, bu listeden rastgele bir kelime seçmek için Math.random() fonksiyonu kullanılmıştır.
        Kullanıcı, tahmin etmek istediği harfleri girebilir. Tahmin edilen harfler,
        kelimenin doğru harfleriyle yer değiştirilir ve kalan hak sayısı tutulur.
        Tahmin edilen kelimenin her aşaması ekrana yazdırılır.
        Kullanıcının tahmin hakkı bittiğinde, doğru kelime ekrana yazdırılır
 */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] kelimeler={"java","programlama","fonksiyon","yazilan","degisken","kodlama"};
        String secilenKelime=kelimeler[(int) Math.random()* kelimeler.length]; // kelimeler array den rastgele bir kelime getir
        int kelimelength=secilenKelime.length();
        System.out.println("lutfen bir harf giriniz:");
        int can=5;
        String[] tahminEdilenHarfler=new String[secilenKelime.length()];
        for (int i = 0; i < tahminEdilenHarfler.length; i++) {
            tahminEdilenHarfler[i]="_";
        }
        while (can<0){

        }

    }

}
