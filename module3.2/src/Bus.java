public class Bus implements Vehicle{
    String fuel;
    int capacity;

    public Bus(String fuel, int capacity){
        this.fuel = fuel;
        this.capacity = capacity;
    }

    @Override
    public void start(){
        System.out.println("bus is starting");
    }
    @Override
    public void stop(){
        System.out.println("bus is stopping");
    }
    @Override
    public String getInfo(){
        return "type: bus \nfuel: " + fuel + "\ncapacity: " + capacity + " passangers\n";
    }
}
