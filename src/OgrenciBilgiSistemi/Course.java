package OgrenciBilgiSistemi;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;

     Course(String name, String code, String prefix ) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public void addTeacher(Teacher teacher){
        if (teacher.bracnch.equals(this.prefix)){
            this.teacher = teacher;
            printTeacher();
        } else {
            System.out.println("Öğretmen ve Ders Uyuşmuyor");
        }


    }

    public void printTeacher(){
        this.teacher.print();



    }
}
