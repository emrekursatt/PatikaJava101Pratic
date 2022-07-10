package OgrenciBilgiSistemi;

public class Teacher {

    String name;
    String mpno;
    String bracnch;

    public Teacher(String name, String mpno, String bracnch) {
        this.name = name;
        this.mpno = mpno;
        this.bracnch = bracnch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMpno() {
        return mpno;
    }

    public void setMpno(String mpno) {
        this.mpno = mpno;
    }

    public String getBracnch() {
        return bracnch;
    }

    public void setBracnch(String bracnch) {
        this.bracnch = bracnch;
    }

    void print(){
        System.out.println("Adı : " + this.name);
        System.out.println("Telefon : " + this.mpno);
        System.out.println("Bölümü : " + this.bracnch);

    }
}
