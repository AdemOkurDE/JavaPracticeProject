package dayMayis_05;

import java.util.Arrays;
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
        Kullanıcı, tahmin etmek istediği harfleri girebilir.
        Tahmin edilen harfler, kelimenin doğru harfleriyle yer değiştirilir ve kalan hak sayısı tutulur.
        Tahmin edilen kelimenin her aşaması ekrana yazdırılır.
        Kullanıcının tahmin hakkı bittiğinde, doğru kelime ekrana yazdırılır
 */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] kelimeler={"java","programlama","fonksiyon","yazilan","degisken","kodlama","adana","kayseri","zonguldak","elma","armut","havuc","mandalina"};
        int ratgeleSayi=(int)(Math.random()* kelimeler.length);

        String secilenKelime=kelimeler[ratgeleSayi ]; // kelimeler array den rastgele bir kelime getir

        //System.out.println( ratgeleSayi);
        //System.out.println(secilenKelime);
        int kelimelength=secilenKelime.length();
        //System.out.println(kelimelength);

        int can=5;
        System.out.println("kalan hak : "+can);
        String[] tahminEdilenHarfler=new String[secilenKelime.length()];

        for (int i = 0; i < tahminEdilenHarfler.length; i++) {
            tahminEdilenHarfler[i]="_";
        }
        System.out.println(Arrays.toString(tahminEdilenHarfler));
        String harf="";
        int bulunanHarf=0;
        while (can>0&&bulunanHarf<secilenKelime.length()){
            System.out.println("lutfen bir harf giriniz:");
            harf= scanner.next().toLowerCase().substring(0,1);
            if (secilenKelime.contains(harf)){
                for (int i = 0; i < secilenKelime.length(); i++) {
                    if (secilenKelime.substring(i,i+1).equals(harf)){
                        tahminEdilenHarfler[i]=harf;
                        bulunanHarf++;
                    }
                }
                System.out.println(Arrays.toString(tahminEdilenHarfler));
            }else can--;

            System.out.println("kalan hak : "+can);
        }
        System.out.println(Arrays.toString(tahminEdilenHarfler));
        if (can<=0){
            System.out.println("Aradiginiz kelime : " + secilenKelime);
        }else {
            System.out.println("Tebrikler bildiniz!");
        }

    }

}
