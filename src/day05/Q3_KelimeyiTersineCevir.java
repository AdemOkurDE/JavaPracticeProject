package day05;

import java.util.Scanner;

public class Q3_KelimeyiTersineCevir {
    public static void main(String[] args) {
        // SORU:kullanıcıdan bir cümle veya kelime girmesini isteyip
        // girilen değeri tersine yazdıran bir method oluşturun

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir cumle ya da kelime giriniz : ");

        String kelime = scanner.nextLine();
        tersCevir(kelime);

    }
    public static void tersCevir(String word){
        String bosKova="";

        for (int i = word.length()-1; i >=0 ; i--) {

            bosKova+=word.charAt(i);

        }
        System.out.println(bosKova);
    }
}
