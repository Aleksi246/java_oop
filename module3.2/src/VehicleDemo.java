public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle car = new Car("gasoline", "yellow");
        Vehicle motorcycle = new Motorcycle("ethanol", "red");
        Vehicle bus = new Bus("diesel", 40);

        car.start();
        car.stop();
        System.out.println(car.getInfo());

        motorcycle.start();
        motorcycle.stop();
        System.out.println(motorcycle.getInfo());

        bus.start();
        bus.stop();
        System.out.println(bus.getInfo());




    }
}
