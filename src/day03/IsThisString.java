package day03;

import java.util.Scanner;

public class IsThisString {
// Kullanicidan alinan karekterlerin string olup olmadigini kontrol eden bir java program yaziniz

    static Scanner scan = new Scanner(System.in);

    public static void isThisString() {
        System.out.println("Please input a string text...");
        // Kullanici int bir giris yapabilir ==> kontrol etmemiz gerek
        if (scan.hasNextInt()) { // scan.hasNextInt() ==>> eger scan yani kullanicinin giris yaptigi data int ise true
            int input = scan.nextInt();
            System.out.println("This is an integer input :" + input);
            isThisString(); // method call yaptik
        } else if (scan.hasNextDouble()) {
            double doubleInput = scan.nextDouble();
            System.out.println("This is a double input :" + doubleInput);
            isThisString();
        } else if (scan.hasNext()) {
            String stringData = scan.next();
            System.out.println("Great this is a string input...");
        }
    }
   /*
    Kullanici karışık string ve int girerse nasil string icerisinde int oldugu check edilebilir?
    for dongusu ile her bir karektere bakilabilir...

    */


    public static void main(String[] args) {

        isThisString();
    }
}
