package day02;

import java.util.Scanner;

public class OrnekSoru3 {
    public static void main(String[] args) {

        /*
         * Write a Java program that asks to user 2 questions Question
         * 1 = how many tea do you drink in a day? Question
         * 2 = how many sugar do you use for a glass of tea?
         *
         * Calculate how many sugar does user use as kilogram in a year and in 40 years
         * then print it on the console
         * If user doesn’t use sugar print “Good Job, less sugar more health”
         *
         * (Hint 1 sugar = 2.7 gr)
         */
        /*
        Türkcesi :
        Kullanıcıya 2 soru soran bir Java programını içerir
        Soru * 1 = günde kaç çay içersiniz?
        Soru * 2 = Bir bardak çay için ne kadar şeker kullanıyorsunuz?
        * * Kullanıcının bir yılda ve 40 yılda kilogram olarak kaç şeker kullandığını hesaplayın
        * sonra konsola yazdırın
        * Kullanıcı şeker kullanmıyorsa “Aferin, az şeker çok sağlık” yazdırın
        * * (İpucu 1 şeker = 2.7gr)
        */

        Scanner input = new Scanner(System.in);

        System.out.print("Günde kaç çay içersiniz? ");
        int cayAdeti = input.nextInt();

        System.out.print("Bir bardak çay için kaç şeker kullanıyorsunuz? ");
        double sekerAdeti = input.nextDouble();

        double sekerYillik = cayAdeti * sekerAdeti * 365 * 2.7 / 1000;

        if (sekerYillik == 0) {
            System.out.println("Aferin, az şeker çok sağlık!");
        } else {
            System.out.println("Yılda " + sekerYillik + " kilogram şeker kullanıyorsunuz.");
            System.out.println("40 Yılda toplam " + sekerYillik*40 + " kilogram şeker kullanıyorsunuz.");
        }
    }
}
