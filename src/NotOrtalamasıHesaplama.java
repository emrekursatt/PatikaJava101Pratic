import java.util.Scanner;

public class NotOrtalamasıHesaplama {
    public static void main(String[] args) {

        //Değişkenleri Oluşturalım.

        int matematik;
        int fizik;
        int kimya;
        int türkce;
        int tarih;
        int müzik;

        //Verileri Kullanıcadan alalım.

        Scanner input = new Scanner(System.in);

        //Öğrenciden notları alalım.

        System.out.println("Matematik Notu ? =");
        matematik = input.nextInt();

        System.out.println("Fizik Notu ? =");
        fizik = input.nextInt();

        System.out.println("Kimya Notu ? =");
        kimya = input.nextInt();

        System.out.println("Türkçe Notu ? =");
        türkce = input.nextInt();

        System.out.println("Tarih Notu ? =");
        tarih = input.nextInt();

        System.out.println("Müzik Notu ? =");
        müzik = input.nextInt();

       int toplam = matematik + fizik + kimya + türkce + tarih + müzik;
       double sonuc = toplam / 6 ;

       System.out.println("Ortalamanız = " + sonuc);

        boolean kosul1 = sonuc==60;
        boolean kosul2 = sonuc>=60;

        boolean sonuc1 =kosul1 || kosul2;

        String str =(sonuc1)? "*****Sınıf Geçtin Tebrikler*****": "Malesef Sınıfta Kaldın ";

        System.out.println(str);











    }

}
