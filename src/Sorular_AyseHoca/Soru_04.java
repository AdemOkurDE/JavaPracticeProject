package Sorular_AyseHoca;

import java.util.Scanner;

public class Soru_04 {
    /*
     * Ask the user for a String and a sentences
     * Find and print occurrence of String in sentences.
     * (without case sensitivity)
     *
     * sentences =“hihihi” String=“hi” output=“There are 3 "hi"s in hihihi "
     * sentences =“I am coming” String=“com” output ="there is 1 “com” in sentences "
     */

    /*
     * Kullanıcıdan bir kelime ve bir cümle isteyin
     * Cümlede kelime geciyorsa bulun ve kacdefa oldugunu yazdırın.
     * (büyük/küçük harf duyarlılığı olmadan)
     *
     * cümleler =“hihihi” String=“hi” output=“hihihi'de 3 "hi" var "
     * cümleler =“Geliyorum” String=“el” output ="cümlelerde 1 “el” var "
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir cumle giriniz :");
        String cumle = scanner.nextLine();

        System.out.println("Lutfen cumlede aranacak kelimeyi giriniz :");
        String kelime=scanner.nextLine();

        String ilkCumle=cumle;

        int sayac=0;
        boolean varMi=true;
        int indexNo= 0;

        while (varMi){
            varMi=cumle.contains(kelime);
            if (varMi){
                indexNo=cumle.indexOf(kelime);
                sayac++;
                cumle=cumle.substring(indexNo+1);
            }
        }
        System.out.println(ilkCumle + " cümlenizde "+ kelime+ " kelimesi "+sayac+" adet vardir!");



//        varMi=cumle.substring(indexNo+1).contains(kelime);
//        System.out.println(varMi);
//
//        indexNo=cumle.indexOf(kelime,indexNo+1);
//        System.out.println(indexNo);
//
//        varMi=cumle.substring(indexNo+1).contains(kelime);
//        System.out.println(varMi);





    }
}
