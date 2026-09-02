package Jobsheet_01;

public class RoadBike extends Bike{
    private int tireWidth;

    public void setTireWidth(int width){
        tireWidth = width;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("Tire Width: " + tireWidth + " mm");
        System.out.println("Bike Type: Road Bike");
    }
}
