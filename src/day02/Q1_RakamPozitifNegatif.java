package day02;

import java.util.Scanner;

public class Q1_RakamPozitifNegatif {
    public static void main(String[] args) {
        //Soru :


        //Adm nin yaptigi :

//        Scanner scanner =new Scanner(System.in);
//
//        System.out.println("Lütfen bir sayi giriniz :");
//        int girilenSayi = scanner.nextInt();
//
//        if (girilenSayi <0){
//            System.out.println("Negatif Sayi");
//        } else if (girilenSayi>=10) {
//            System.out.println("Pozitif Sayi");
//
//        }else System.out.println("Rakam");

        // Hocanin yaptigi  1:

        Scanner cicek =new Scanner(System.in);

        System.out.println("Lütfen bir sayi giriniz :");

        int sayi = cicek.nextInt();

        if (sayi>=0){
            if (sayi<10) System.out.println("Rakam");
            else System.out.println("Pozitif Sayi");
        }else System.out.println("Negatif Sayi");


        // Hocanin yaptigi 2 :

        System.out.println("****************** 2. Cözüm :**************");

        if (sayi>=0 && sayi<10)System.out.println("*Rakam");
        else  if (sayi>=10) System.out.println("*Pozitif Sayi");
        else System.out.println("*Negatif Sayi");

        // Hocanin yaptigi 3 :

        System.out.println("****************** Ternary Cözüm :**************");

        boolean sart1 = sayi >= 0;
        boolean sart2 = sayi <10;

        String sonuc = (sart1) ? ((sart2) ? "-Rakam-" : "-Pozitif Sayi-" ) : "-Negatif Sayi-";
        System.out.println(sonuc);





    }
}
