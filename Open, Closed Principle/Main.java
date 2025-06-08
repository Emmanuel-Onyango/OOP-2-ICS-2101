public class  Main{
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.drive();
        car.brake();
        System.out.println("\n");

        Vehicle truck = new Truck();
        truck.drive();
        truck.brake();
    }

}