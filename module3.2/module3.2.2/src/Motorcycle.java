public class Motorcycle extends AbstractVehicle{
    String color;
    String fuel;

    public Motorcycle(String fuel, String color){
        this.fuel = fuel;
        this.color = color;
    }

    @Override
    public String getInfo(){
        return "type: motorcycle \nfuel: " + fuel + "\ncolor: " + color + "\n";
    }
    @Override
    public double calculateFuelEfficency(){
        return motofe;
    }
    @Override
    public String lpkm(){
        return "l/km";
    }
}
