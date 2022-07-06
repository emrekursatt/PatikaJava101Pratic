import java.util.Scanner;

public class GelismisHesapMakinesi {

    static int toplam ( int a , int b ){

        int sonuc = a + b;
        System.out.println("Toplam =" + sonuc);
        return sonuc;
    }

    static int fark (int a , int b){

        int sonuc = a-b;
        System.out.println("Fark = " + sonuc);
        return sonuc;
    }

    static int carpım (int a , int b){

        int sonuc = a*b;
        System.out.println("Çarpım = " + sonuc);
        return sonuc;

    }

    static int bolum (int a ,int b) {
        if ( b == 0){

            System.out.println("Payda Sıfır Olamaz Lütfen Tekrar Deneyin");
            return 0;
        }
        int sonuc = a/b;
        System.out.println("Bölüm = " + sonuc);
        return sonuc;

    }

    static int uslu (int a, int b){

        int sonuc = 1;
        for ( int i = 1 ; i <= b;i++ ) {
            sonuc *=a;

        }
        System.out.println("Üs Alma Sonucu = " + sonuc);
        return sonuc;

        }

    static void faktoriyel (int b){

        int sonuc = 1;

        for (int i = 1 ; i <= b ;i++){

            sonuc *=i;
        }
        System.out.println("Faktoriyeli = " + sonuc);

    }

    static int mod ( int a , int b) {

        int sonuc = a % b;
        System.out.println("Mod Sonucu = " + sonuc);
        return sonuc;



    }

    static void diktortgen (int a , int b) {
        int sonuc1 = (2*a)  +  (2*b);
        System.out.println("Diktörtgenin Çevresi = " + sonuc1);
        int sonuc2 = a*b;
        System.out.println("Diktörgenin Alanı = " + sonuc2);

    }





    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

    while (true){
        System.out.println(menu);
        System.out.println("Yapılacak Olan İşlemi Seçiniz");
        select = scan.nextInt();
        System.out.println("İlk Sayıyı Seçiniz");
        int a = scan.nextInt();
        System.out.println("İkinci Sayıyı Seçiniz");
        int b = scan.nextInt();

        if ( select == 0 ){
            break;

        }

        switch (select){
            case 1:
                toplam( a , b);
                break;

            case 2:
                fark( a, b);
                break;

            case 3:
                carpım(a ,b);
                break;

            case 4:
                bolum(a , b);
                break;

            case 5:

                uslu(a ,b);
                break;

            case 6:
                faktoriyel(b);
                break;

            case 7:
                mod(a , b);
                break;

            case 8:
                diktortgen(a ,b);
                break;
        }

        System.out.println("Güle Güle");




    }


    }




}
