public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle car = new Car("gasoline", "yellow");
        Vehicle motorcycle = new Motorcycle("ethanol", "red");
        Vehicle bus = new Bus("diesel",40);

        Vehicle emoto = new ElectricMotorcycle("blue");
        Vehicle ecar = new ElectricCar("black");

        car.start();
        car.stop();
        System.out.println(car.getInfo());

        motorcycle.start();
        motorcycle.stop();
        System.out.println(motorcycle.getInfo());

        bus.start();
        bus.stop();
        System.out.println(bus.getInfo());

        emoto.start();
        emoto.stop();
        System.out.println(emoto.getInfo());

        ecar.start();
        ecar.stop();
        System.out.println(ecar.getInfo());

        ((ElectricCar) ecar).charge();
        ((Car) car).charge();

        System.out.println(car.calculateFuelEfficency() + " "+car.lpkm());
        System.out.println(ecar.calculateFuelEfficency() +" "+ ecar.lpkm());



    }
}
