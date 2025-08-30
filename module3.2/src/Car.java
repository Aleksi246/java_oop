public class Car implements Vehicle{
    String fuel;
    String color;

    public Car(String fuel, String color){
        this.fuel = fuel;
        this.color = color;
    }

    @Override
    public void start(){
        System.out.println("car is starting");
    }
    @Override
    public void stop(){
        System.out.println("car is stopping");
    }
    @Override
    public String getInfo(){
        return "type: car \nfuel: " + fuel + "\ncolor: " + color + "\n";
    }




}
