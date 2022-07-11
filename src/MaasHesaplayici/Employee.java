package MaasHesaplayici;

public class Employee {

String name;
double salary;
int workHours;
int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }
    public double tax (){
    if ( this.salary < 1000){
        return this.salary;
    }else {
        double tax = this.salary * 0.03;
        return tax;
    }

    }

    public int bonus (){
        if(this.workHours > 40 ){

            int bonus = (this.workHours - 40) *30;
            return bonus;
        }
            return 0;
    }
    public double raiseSalary (){

        int a = 2021 - this.hireYear;
       
        if ( a<10 ){
            double raiseSalary = this.salary * 0.05;
            return  raiseSalary;
        } else if ( a > 9 && a <20) {
            double raiseSalary = this.salary * 0.10;
            return  raiseSalary;
        } else if ( a > 19){
            double raiseSalary = this.salary * 0.15;
            return  raiseSalary;
        }else {
        return 0;
        }

    }

    @Override
    public String toString() {
        double tot = this.salary - tax() + bonus() + raiseSalary();
        double total = salary + bonus()  - tax();
        System.out.println("Çalışanın Adı :" + this.name);
        System.out.println("Çalışanın Maaşı :" + this.salary);
        System.out.println("Haftalık Çalışma Saati :" + this.workHours);
        System.out.println("İşe Başlangıç Yılı :" + this.hireYear);
        System.out.println("Çalışandan Alınacak Vergi :" + tax());
        System.out.println("Çalışana Verilecek Bonus :" + bonus());
        System.out.println("Çalışana Verilecek Maaş Artışı :" + raiseSalary());
        System.out.println("Vergi ve Bonuslar İle Maaş :" + total);
        System.out.println("Yeni Toplam Maaş :" + tot );
        return null;
    }
}
