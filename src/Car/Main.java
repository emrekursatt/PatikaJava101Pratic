package Car;

public class Main {

    public static void main(String[] args) {
        Car audi = new Car("Audi", 10 , "Blue");
        audi.printİnfo();


        Car bmw = new Car();
        bmw.model = "BMW E250";
        bmw.speed = 20;
        System.out.println(bmw.model + " Hızı :" + bmw.speed);
/*
        Car mercedes = new Car();
        mercedes.model = "Mercedes";
        mercedes.speed = 30;
        System.out.println(mercedes.model + " Hızı :" + mercedes.speed);

*/

    }

}
