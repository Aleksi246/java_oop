public class Bus extends AbstractVehicle{
    String fuel;
    int capacity;

    public Bus(String fuel, int capacity){
        this.fuel = fuel;
        this.capacity = capacity;
    }

    @Override
    public String getInfo(){
        return "type: bus \nfuel: " + fuel + "\ncapacity: " + capacity + " passangers\n";
    }
    @Override
    public double calculateFuelEfficency(){
        return busfe;
    }
    @Override
    public String lpkm(){
        return "l/km";
    }
}
