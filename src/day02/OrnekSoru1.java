package day02;

import java.util.Scanner;

public class OrnekSoru1 {
    public static void main(String[] args) {
        /*
         * ask user to create a password.
         * it should have at least
         * 1 special char
         * 1 uppercase
         * 1 lowercase
         * 1 digit
         * the length of password should be at least 8 characters
         *
         * Türkcesi :
         *
         * * kullanıcıdan bir şifre oluşturmasını isteyin.
         *      asgari özellikleri :
         *      1 özel karakter
         *      1 büyük harf
         *      1 küçük harf
         *      1 sayi
         *      şifre uzunluğu en az 8 karakter olmalıdır
         *
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir Password giriniz : ");

        String pass= scanner.nextLine();


        for (int i = 0; i >= pass.length(); i++) {

        }



    }
}
