package day04;

import java.util.Scanner;

public class Q02_ArrayElemanlarToplami {
    static int size=0;
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {


        //printArrayMethod();
        arrayElemanlariToplami();


    }
    public static void arrayElemanlariToplami(){
        System.out.println("Lutfen Array in size ini belirtin");
        size = scanner.nextInt() ;
        int[] employeeSalary = new int[size] ;

        //Array i create etmek icin for loop kullanalim
        for(int i =0 ; i<size ; i++){
            System.out.println(1+i+". Calisan");
            employeeSalary[i] = scanner.nextInt() ;
        }
        int sayac = 0;
        //Array icersindeki verilerin toplami
        for(int i=0 ; i<size ; i++){
            sayac += employeeSalary[i];
        }
        System.out.println("Calisanlarin Maaslari Toplami :"+ sayac);

    }
}
