package OgrenciBilgiSistemi;

public class Main {

    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("Ali" , "555" ,"Mat" );
        Teacher teacher2 = new Teacher("Mustafa Kemal" , "000" ,"Trh");
        Teacher teacher3 = new Teacher("Külyutmaz" , "111" , "Fzk");

        Course matematik = new Course("Matematik ", "101","Mat");

        Course tarih = new Course("Tarih" , "102" , "Trh");

        Course fizik = new Course("Fizik" , "103","Fzk");


        Student student1 = new Student(matematik,tarih,fizik , "İnek Şaban","123","4");

        student1.addBulkExamNote(100,50,75);
        student1.isPass();

        Student student2 = new Student(matematik, tarih,fizik,"Güdük Necmi","456" , "4");
        student2.addBulkExamNote(25,55,47);
        student2.isPass();

    }

}
