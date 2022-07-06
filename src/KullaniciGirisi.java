import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName; //İlk önce kullanıcıdan alacağımız verileri tanımladım.
        String password;

        Scanner input = new Scanner(System.in); //Kullanıcıdan almak için scanner yazdım.

        System.out.println("Kullanıcı Adı : ");
        userName = input.nextLine();

        System.out.println("Şifre : ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123") ){

            System.out.println("Başarılı Bir Şekilde Giriş Yaptınız");

        }else {

            System.out.println("Kullanıcı Adı veya Şifre Yanlış Lütfen Tekrar Deneyiniz");
        }

    }





}
