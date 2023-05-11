package day07;

public class Q4_EbobEkok {

    // Take 2 integers from user and find GCD (Greatest Common Divisor) and LCM (Least Common Multiple)
    // Kullanicidan 2 adet tamsayi alip, EBOB ve EKOK'larini bulan program yaziniz.

    public static void main(String[] args) {
        int sayi1=6;
        int sayi2=4;
        int ebob=0;
        int ekok=0;
        int kucukSayi=0;
        int buyukSayi=0;
        if (sayi1<sayi2){
            kucukSayi=sayi1;
            buyukSayi=sayi2;
        }else {
            kucukSayi=sayi2;
            buyukSayi=sayi1;
        } // ya da Math class'i kullanabiliriz :   int buyukSayi = Math.max(sayi1,sayi2);
        System.out.println("\n************* EBOB 1. COZUM *************");
        for (int i = 1; i <=kucukSayi ; i++) {
            if (sayi1%i==0 && sayi2%i==0){
                ebob=i;
            }

        }
        System.out.println(sayi1 +" ve "+sayi2+" sayilarinin EBOB'u : " +ebob);

        System.out.println("\n************* EBOB 2. COZUM *************");
        for (int i = kucukSayi; i >=1 ; i--) {
            if (sayi1%i==0 && sayi2%i==0){
                System.out.println(sayi1 +" ve "+sayi2+" sayilarinin EBOB'u : " +i);break;
            }

        }
        System.out.println("\n************* EKOK 1. COZUM *************");
        for (int i = 1; i <=kucukSayi ; i++) {
            if (buyukSayi*i % kucukSayi==0){
                ekok=buyukSayi*i;break;
            }
        }
        System.out.println(sayi1 +" ve "+sayi2+" sayilarinin EKOK'u : " +ekok);

        System.out.println("\n************* EKOK 2. COZUM *************");

        for (int i = buyukSayi; i <=sayi1*sayi2 ; i++) {
            if (i%sayi1==0&&i%sayi2==0){
                System.out.println(sayi1 +" ve "+sayi2+" sayilarinin EKOK'u : " +i);
                break;
            }
        }


    }
}
