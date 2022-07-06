import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {


        int a;
        int b;
        int secim;

        Scanner input = new Scanner(System.in);

        System.out.println("1.Sayıyı Giriniz : ");
        a = input.nextInt();

        System.out.println("2.Sayıyı Giriniz : ");
        b = input.nextInt();

        System.out.println("Seçim Yapınız : ");
        System.out.println("1-Toplama/n2-Çıkarma/n3-Çarpma/n4-Bölme ");

        secim = input.nextInt();

        switch (secim){
                case 1:
                System.out.println("Toplama İşleminin Sonucu :  " + (a+b));
                break;

                case 2:
                System.out.println("Çıkarma İşleminin Sonucu :  " + (a-b));

                case 3:
                System.out.println("Çarpma İşleminin Sonucu :  " + (a*b));
                break;

                case 4:
                System.out.println("Bölme İşleminin Sonucu :  " + (a/b));
                break;


        }
    }
}
