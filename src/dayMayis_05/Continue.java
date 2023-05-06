package dayMayis_05;

public class Continue {
    public static void main(String[] args) {


        for (int i = 1; i < 6; i++) {
            if (i==3){
                continue; // Kisadevre yaptir. basa don!! bundan sonra devam etme!!
            }
            System.out.println(i+"");
        }

        System.err.println("islem bitti"); // Hata yazdirmak icin "serr" kisayoluyla Error mesaji yazdirilir.KIRMIZI olarak!!

    }
}
