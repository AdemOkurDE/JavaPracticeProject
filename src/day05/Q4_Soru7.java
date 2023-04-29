package day05;

import java.util.Scanner;

public class Q4_Soru7 {
    public static void main(String[] args) {
        /*
         * Ask the user for a String and a sentences
         * Find and print occurrence of String in sentences.
         * (without case sensitivity)
         *
         * sentences =“hihihi” String=“hi” output=“There are 3 "hi"s in hihihi "
         * sentences =“I am coming” String=“com” output ="there is 1 “com” in sentences "
        TR:
        *  Kullanıcıdan bir dize ve bir cümle isteyin.
        * Dizenin cümle içindeki geçiş sayısını bulun ve yazdırın.
        * (Büyük/küçük harf duyarlılığı olmadan)

        * Örnek:
        * Cümle = "hihihi", Dize = "hi", Çıktı = "hihihi içinde 3 adet "hi" bulunuyor."
        * Cümle = "Geliyorum", Dize = "gel", Çıktı = "Geliyorum içinde 1 adet "gel" bulunuyor."
         */
        //Ortak Alan :
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen bir cümle girin: ");
        String cumle = scanner.nextLine();

        System.out.print("Lütfen bir kelime girin: ");
        String kelime = scanner.nextLine();

        int kelimeTekrar = 0;

        //benim cozumum:

        int indexNo= cumle.toLowerCase().indexOf(kelime.toLowerCase());
        String cumleKopya=cumle.toLowerCase();

        while (indexNo!=-1){
            cumleKopya=cumleKopya.substring(indexNo+1);

            indexNo=cumleKopya.indexOf(kelime.toLowerCase());
         kelimeTekrar++;
        }

        System.out.println(cumle+" cumlesinde "+kelimeTekrar+" adet \"" +kelime+"\" kelimesi gecmektedir");

        System.out.println("===========ChatGPT 1. Cozum==========");
        kelimeTekrar=0;
        for (int i = 0; i <= cumle.length() - kelime.length(); i++) {
            boolean eslesme = true;
            for (int j = 0; j < kelime.length(); j++) {
                if (Character.toLowerCase(cumle.charAt(i+j)) != Character.toLowerCase(kelime.charAt(j))) {
                    eslesme = false;
                    break;
                }
            }
            if (eslesme) {
                kelimeTekrar++;
            }
        }
        System.out.println(cumle + " içinde " + kelimeTekrar + " adet \"" + kelime + "\" bulunuyor.");


        System.out.println("===========2. Cozum==========");


        kelimeTekrar= 0;
        int index = cumle.toLowerCase().indexOf(kelime.toLowerCase());
        while (index != -1) {
            kelimeTekrar ++;
            index = cumle.toLowerCase().indexOf(kelime.toLowerCase(), index + 1);
        }
        System.out.println(cumle + " içinde " + kelimeTekrar + " adet \"" + kelime + "\" bulunuyor.");
    }

}
