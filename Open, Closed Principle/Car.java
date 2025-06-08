public class Car extends Vehicle{
    
    @Override
    public void drive(){
        System.out.println("Car is driving");
    }
    @Override
    public void brake(){
        System.out.println("Car is braking");
    }
}
