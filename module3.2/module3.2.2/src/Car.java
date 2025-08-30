public class Car extends AbstractVehicle{
    String color;
    String fuel;

    public Car(String fuel, String color){
        this.fuel = fuel;
        this.color = color;
    }

    @Override
    public String getInfo(){
        return "type: car \nfuel: " + fuel + "\ncolor: " + color + "\n";
    }
    @Override
    public double calculateFuelEfficency(){
        return carfe;
    }
    @Override
    public String lpkm(){
        return "l/km";
    }

}
