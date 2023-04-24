package sorular_MustafaHoca_A;

import java.util.Scanner;

public class Soru_10_Murat {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a name:");
        String name = scanner.next();

        System.out.println("enter a surname:");
        String surName = scanner.next();

        System.out.println("enter a valid card number:");
        String cardNo = scanner.next();

        if (cardNo.length() == 16) {
            for (int i = 1; i < name.length(); i++) {
                char konum = name.charAt(i);
                name = name.replace(konum, '*');
            }
            System.out.print("Name: " + name.toUpperCase() + " ");
            for (int i = 1; i < surName.length(); i++) {
                char konum = surName.charAt(i);
                surName = surName.replace(konum, '*');
            }
            System.out.print("Sur name: " + surName.toUpperCase() + " ");
            String cardNoYildiz ="************";
//            for (int i = 0; i < 13; i++) {
//
//                char konum = cardNo.charAt(i);
//                cardNoYildiz = cardNo.replace(konum, '*');
//            }
            System.out.print("Card no: " + cardNoYildiz + "");
            System.out.print(cardNo.substring(cardNo.length()-4));
        } else {
            System.out.println("invalid kredit card number");
        }

    }
}

