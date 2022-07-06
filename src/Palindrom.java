public class Palindrom {

    static boolean isPalindrom (int number) {

        int temp = number;
        int reverseNumber = 0;
        int lastNumber;

        while ( temp !=0) {

            System.out.println("=====");
            System.out.println("Sayı = " + temp);

            lastNumber = temp %10;
            System.out.println("Son Basmak = " + lastNumber);

            reverseNumber = (reverseNumber * 10) + lastNumber;
            System.out.println("Yeni Sayı = " + reverseNumber);


            temp = temp / 10;

        }

    return true;
    }

    public static void main(String[] args) {
        isPalindrom(546);
    }

}
