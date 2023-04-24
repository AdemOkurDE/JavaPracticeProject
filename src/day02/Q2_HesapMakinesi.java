package day02;

import java.util.Scanner;

public class Q2_HesapMakinesi {
    public static void main(String[] args) {

        /*
         * Kullanicidan iki tamsayi sayi ve islem cinsini alin
         * ve sayilari kullanicinin belirledigi isleme tabi tutup sonucu yazdirin.
         *
         * islem cinsi icin 1:toplama 2:cikarma 3:carpma 4: bolme
         *
         * Ornek : Inputs : sayilar : 18 , 10  islem : 3
         *         Output : 18 X 10 = 180
         */


        Scanner scanner = new Scanner(System.in);


        System.out.println("Matematiksel isleme sokmak icin iki tane tamsayi giriniz : ");

        int a= scanner.nextInt();
        int b= scanner.nextInt();

        System.out.println("Islem türünü seciniz : \n\t1 : Toplama\n\t" +
                "2 : Cikarma\n\t3 : Carpma\n\t4 : Bölme");

        int islem = scanner.nextInt();

        System.out.println("******************* IF Cözümü *******************");


        if (islem == 1) System.out.println(a+b);
        else if (islem==2) System.out.println(a-b);
        else if (islem==3) System.out.println(a*b);
        else if (islem==4) {
            if (b==0) System.out.println("0'a bölüm tanimsizdir!");
            else System.out.println(a / b);
        }
        else System.out.println("Yalis giris yaptiniz, lütfen tekrar deneyiniz!");


        System.out.println("******************* SWITH CASE Cözümü *******************");
        System.out.println("Islemini yapmak istediginiz issareti giriniz ");
        char isaret =scanner.next().charAt(0);

        switch (isaret){
            case '+':System.out.println(a + "+" + b + "="+ (a+b));
            break;
            case '-':System.out.println(a + "-" + b + "="+ (a-b));
            break;
            case '*':System.out.println(a + "*" + b + "="+ (a*b));
            break;
            case '/':     if (b==0) System.out.println("0'a bölüm tanimsizdir!");
                        else System.out.println(a + "/" + b + "="+ (a/b));
                        break;
            default:System.out.println("Yalis giris yaptiniz, lütfen tekrar deneyiniz!");
        }

        System.out.println("******************* SWITH CASE 2  Cözümü *******************");

        switch (islem){
            case 1:System.out.println(a + "+" + b + "="+ (a+b));
                break;
            case 2:System.out.println(a + "-" + b + "="+ (a-b));
                break;
            case 3:System.out.println(a + "*" + b + "="+ (a*b));
                break;
            case 4:     if (b==0) System.out.println("0'a bölüm tanimsizdir!");
            else System.out.println(a + "/" + b + "="+ (a/b));
                break;
            default:System.out.println("Yalis giris yaptiniz, lütfen tekrar deneyiniz!");
        }


    }
}
