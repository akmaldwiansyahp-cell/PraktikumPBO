package Jobsheet_01;

public class Bike {
    private String brand;
    private int speed;
    private int gear = 1;
    private final int[] gear_speed = {5, 10, 25, 30, 40, 60};

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void gearChange(int gearValue){
        if (gearValue < 1 || gearValue > 6) {
            System.out.println("Invalid gear value, gear must between 1 and 6");
        }else{
            gear = gearValue;
        }
    }

    public int speedAcceleration(int increment){
        speed += increment;
        if (speed > gear_speed[gear-1]) {
            speed = gear_speed[gear-1];
        }
        return speed;
    }

    public int speedDeceleration(int decrement){
        speed -= decrement;
        if (speed < 0) {
            speed = 0;
        }
        return speed;
    }

    public void print(){
        System.out.println("Brand   : " + brand);
        System.out.println("Speed   : " + speed);
        System.out.println("Gear    : " + gear);
    }
}
