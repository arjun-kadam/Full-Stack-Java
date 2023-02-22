class Vehicle {
    public void run() {
        System.out.println("I can run on raods");
    }

}
class NewCar extends Vehicle{
    @Override
    public void run() {
        System.out.println("Car can run on electric power");
    }

    public void flyMode() {
        System.out.println("This Car can Fly");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Vehicle NewEV=new NewCar();
        NewCar FlyEV=new NewCar();
        NewEV.run();
        FlyEV.flyMode();

    }
}
