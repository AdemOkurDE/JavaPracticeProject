package day05;

import java.util.Scanner;

public class Q2_BolmeOperatoruOlmadanBolme {


    static int bolum; //bolumu dongunun icerisinde saymasi icin herseferinde artacak bir sayac olusturdum
    public static void main(String[] args) {

        // Kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
        // kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bolmek istediginiz sayiyi giriniz : ");
        int a = scanner.nextInt();

        System.out.println("Lutfen bolen sayiyi giriniz : ");
        int b = scanner.nextInt();

        System.out.println(bol(a, b));

        System.out.println(bol(56,8)); //7
        System.out.println(bol(897, 62));
        System.out.println(bol(44, 22));
        System.out.println(bol(15, 7));





        //System.out.println((bolunen+bolen*bolum) + " / " + bolen + " = bolum = " + bolum + " kalan = "+bolunen);

    }
    public static int bol(int bolunen , int bolen){
        bolum=0;
        while (bolunen>=bolen){
            bolum++;
            bolunen-=bolen;  // bolunen = bolunen - bolen
        }

        return bolum;
    }

}
