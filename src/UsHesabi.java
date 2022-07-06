import java.util.Scanner;

public class UsHesabi {

    static int UsHesaplama (int a , int b ) {

        int sonuc = 1;
        if (b == 0) {
            return 1;

        }
        for (int i = 1; i <= b; i++) {
            sonuc *= a;
        }
        return sonuc;
    }


        public static void main (String[]args){

            Scanner input = new Scanner(System.in);
            System.out.println("Üs Hesaplamaya HOşgediniz , İstenen Değerleri Giriniz");
            System.out.print("Taban Değerini Giriniz = ");
            int a = input.nextInt();
            System.out.print("Üs Değerini Giriniz = ");
            int b = input.nextInt();

        System.out.println("Cevap = " + UsHesaplama( a , b ));

        }




}
