package Jobsheet_01;

public class BikeDemo {
    public static void main(String[] args) {
        Bike mountainBike = new Bike();
        Bike mountainBike2 = new Bike();

        RoadBike roadBike = new RoadBike();

        RoadBike roaded = new RoadBike();

        mountainBike.setBrand("Trek");
        mountainBike.speedAcceleration(10);
        mountainBike.gearChange(2);
        mountainBike.print();

        mountainBike2.setBrand("Giant");
        mountainBike2.speedAcceleration(20);
        mountainBike2.gearChange(3);
        mountainBike2.print();

        roadBike.setBrand("Specialized");
        roadBike.setTireWidth(25);
        roadBike.speedAcceleration(15);
        roadBike.gearChange(4);
        roadBike.print();

        roaded.setBrand("null");
        roaded.setTireWidth(0);
        roaded.speedAcceleration(0);
        roaded.gearChange(0);
        roaded.print();
    }
}
