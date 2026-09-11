package Jobsheet_03.MotorEncapsulation;

public class MotorDemo {
    public static void main(String[] args) {
        Motor motor = new Motor();
        motor.print();
        motor.tambahKecepatan();

        motor.nyalakanMesin();
        motor.print();

        motor.tambahKecepatan();
        motor.print();

        motor.tambahKecepatan();
        motor.print();

        motor.matikanMesin();
        motor.print();

        motor.kurangKecepatan();
        motor.print();

        motor.nyalakanMesin();
        motor.tambahKecepatan();
        motor.tambahKecepatan();
        motor.tambahKecepatan();
        motor.print();
    }
}
