package Car;

public class Car {
    String type ;
    String color;
    String model ;
    int speed;
    int speedLimit = 180;


    Car (String model , int speed , String color){
        this.model = model;
        this.speed = speed;
        this.color = color;
        this.type = "Sedan";
        this.speedLimit = 180;

    }

    Car() {

    }


    void increaseSpeed (int increment){

        if((this.speed + increment) < speedLimit){

            this.speed +=increment;
        }

    }
    void decreaseSpeed (int decrease){

        if (this.speed >0){
            this.speed -= decrease;
        }

    }
    void printSpeed(){

    System.out.println( this.model +  " Hızınız : " + this.speed);

    }
    void printİnfo(){

        System.out.println("Model : " + this.model);
        System.out.println("Color : " + this.color);
        System.out.println("Type  : " + this.type);
        System.out.println("Speed : " + this.speed);
    }

}