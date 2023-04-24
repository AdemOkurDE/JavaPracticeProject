package Sorular_AyseHoca;

import java.util.Scanner;

public class Soru_06 {

    // Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
    // ad ayrı soyad ayrı sekilde ekrana yazdırınız.

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int boslukIndex=-1;
        System.out.println("Lütfen isminizi arada bosluk olacak sekilde giriniz : ");
        String isim = scanner.nextLine();
        boslukIndex=isim.indexOf(" ");
        String ad=isim.substring(0,boslukIndex);
        String soyad = isim.substring(boslukIndex+1);
        System.out.println("Adiniz : "+ad+"\nSoyadiniz : "+soyad);
    }

}
