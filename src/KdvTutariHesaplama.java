import java.util.Scanner;

public class KdvTutariHesaplama {
    public static void main(String[] args) {
        double tutar;



        Scanner input = new Scanner(System.in);
        System.out.println("Ücret Tutarını Giriniz : ");
        tutar = input.nextDouble();
        if( 0< tutar && tutar <1000 ){
            double kdvOran = 0.18;
            double kdvTutar = tutar *kdvOran;
            double kdvliOran= tutar + kdvTutar;
            System.out.println(kdvliOran);
        }else {
            double kdvOran = 0.08;
            double kdvTutar = tutar *kdvOran;
            double kdvliOran= tutar + kdvTutar;
            System.out.println(kdvliOran);


        }
    }




    }



