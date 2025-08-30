public class Motorcycle implements Vehicle{
    String fuel;
    String color;

    public Motorcycle(String fuel, String color){
        this.fuel = fuel;
        this.color = color;
    }

    @Override
    public void start(){
        System.out.println("motorcycle is starting");
    }
    @Override
    public void stop(){
        System.out.println("motorcycle is stopping");
    }
    @Override
    public String getInfo(){
        return "type: motorcycle \nfuel: " + fuel + "\ncolor: " + color + "\n";
    }
}
