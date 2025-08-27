public class CarDriver {
    public static void main(String[] args) {
        Car myCar;

        myCar = new Car("Toyota Corolla");
        myCar.fillTank();

        myCar.accelerate();

        System.out.println("speed: " + myCar.getSpeed());

        System.out.println("target: " + myCar.getTarget());
        myCar.setTarget(100);
        System.out.println("target: " + myCar.getTarget());


        myCar.toggleCruise();

        myCar.Cruising();

        System.out.println("speed: " +myCar.getSpeed());

        myCar.toggleCruise();


    }
}