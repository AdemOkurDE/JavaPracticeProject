package day07;

public class Q3_TopZiplatma {

    //Bir top belirli yükseklikten atılmaktadır.
    // Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    // Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    // Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do
    // while code blogu create ediniz.

    public static void main(String[] args) {
        double yukseklik=2;

        topuZiplat(yukseklik);
        topuZiplat(5);
        topuZiplat(1);
        topuZiplat(0.8);

    }

    private static void topuZiplat(double yukseklik) {
        double toplamYol=0;
        int ziplamaSayisi=0;
        do {
            toplamYol+=yukseklik+yukseklik*0.75;

            yukseklik=yukseklik*0.75;
            ziplamaSayisi++;

        }while (yukseklik>=1);

        System.out.println("Toplam Yol : " + toplamYol);
        System.out.println("Ziplama Sayisi : "+ziplamaSayisi);

    }


}
