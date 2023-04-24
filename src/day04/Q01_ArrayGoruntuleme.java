package day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q01_ArrayGoruntuleme {
    static int size;

    static Scanner scanner = new Scanner(System.in);

    public static void printArrayMethod() {

        System.out.println("Lutfen Array'in size'ini belirtin : ");
        size = scanner.nextInt();
        int[] ogrencilerinYaslari=new int[size];

        System.out.println("Lutfen Ogrencilerin yaslarini giriniz : ");

        for (int i = 0; i < size; i++) {
            System.out.println(i+1+". Veri");
            ogrencilerinYaslari[i]=scanner.nextInt();
        }

        System.out.println("Olusturulan Arraydeki Ogrencilerin yaslari : ");

        System.out.println(Arrays.toString(ogrencilerinYaslari));
        for (int i = 0; i < size; i++) {
            System.out.print(ogrencilerinYaslari[i]+" ");
        }



    }
    public static void arrayElemanlariToplami(){
        //calisan maaslarini toplatalim

        System.out.println("Lutfen Calisan sayisini belirtin : ");
        size = scanner.nextInt();
        int[] calisanlarinMaaslari=new int[size];

        // calisan maaslarini tek tek array'e girelim
        for (int i = 0; i < size; i++) {
            System.out.println(i+1+". Calisan Maasi : ");
            calisanlarinMaaslari[i]=scanner.nextInt();

        }

        //maaslari toplatalim
        int maaslarToplami=0;
        for (int i = 0; i < size; i++) {
            maaslarToplami += calisanlarinMaaslari[i];
        }

        System.out.println(size + " Calisana ait maaslar toplami : " + maaslarToplami + " €");

    }

    public static void main(String[] args) {
        //printArrayMethod();
        ortakEleman() ;

    }
    /*
   Iki string array icerisindeki ayni elemanlari bulan bir java methodu create ediniz
    */

    public static void ortakEleman(){
        //Verilen iki array i karsilastirmak icin size larinin ayni olmasi gerekiyor
        // veya size i kucuk olana gore karsilastirmak gerekiyor.
        String[] data1 = {"Java","SQL","HTML","Selenium","API","Python","postman","devops"} ;
        String[] data2 = {"Java","SQL","html","selenium","Api","C#","SoapUI","azure"} ;
        // karsilastirdigim elemanlari bir array icerisine atayamayiz cunku ayni olan kac tane
        // eleman var bilmiyoruz yani size i bilmiyoruz. Bu sebepten list e koymak mantikli

        //Ayni olan elemanlari koymak icin bir list olusturalim
        List<String> ortakElemanlarListesi = new ArrayList<>();

        // inner for loop ile array lerin icerisine girip her bir datayi diyerleri ile karsilastiralim
        for (int i = 0 ;i<data1.length ; i++){
            for (int j = 0 ; j<data2.length ; j++){
                if(data1[i].equalsIgnoreCase(data2[j])){
                    ortakElemanlarListesi.add(data1[i]);
                }
            }
        }
        System.out.println("Ortak Elemanlar :"+ ortakElemanlarListesi);
    }




}
