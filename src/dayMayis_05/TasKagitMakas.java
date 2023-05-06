package dayMayis_05;

import java.util.Random;
import java.util.Scanner;

public class TasKagitMakas {
        // Bilgisayara karsi tas kagit makas oyunu oynayacağımız kodları yazınız
        // Kural: 5 puana ilk ulasan oyunu kazanir. adini yazdir.
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random rnd=new Random();

        int userChoise=0;
        int compChoise=0;
        int userPoint=0;
        int compPoint=0;

        do {
            System.out.println("Lutfen secim yapiniz:\n1-Tas\n2-Kagit\n3-Makas ");

            // kullanicidan secimini girmesini isteyelim:
            userChoise=scanner.nextInt();

            //bilgisayar icin random deger uretelim:
            compChoise=rnd.nextInt(3)+1; // 0-3 arasinda(0-1-2) seklinde degerler uretir.
                                                // +1 diyerek(1-2-3)degerlerini uretmesini sagliyoruz.
            if (userChoise==1 && compChoise==2){
                System.out.println("Bilgisayar sectigi : "+compChoise);
                System.out.println("");
                System.out.println();
            }

        }while (userPoint<5||compPoint<5);

    }
}
