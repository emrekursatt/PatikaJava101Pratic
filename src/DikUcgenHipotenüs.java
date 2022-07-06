import java.util.Scanner;

public class DikUcgenHipotenüs {
    public static void main(String[] args) {
        double a ;
        double b ;
        double c ;

        Scanner input = new Scanner(System.in);
        System.out.println("Üçgenin 1. Kenar Uzunuluğunu Giriniz : ");
        a = input.nextDouble();
        System.out.println("Üçgenin 2. Kenar Uzunuluğunu Giriniz : ");
        b = input.nextDouble();
        System.out.println("Üçgenin 3. Kenar Uzunuluğunu Giriniz : ");
        c = input.nextDouble();

        double u = (a+b+c) / 2 ;

        double cevre = 2*u;

        double alan = u * (u - a) *  (u - b) * (u - c);
        System.out.println("Üçgenin Çevresi  : " + cevre );
        System.out.println("Üçgenin Alanı  : " + alan );


    }



}


