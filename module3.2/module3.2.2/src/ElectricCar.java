public class ElectricCar extends AbstractVehicle{
    String color;

    public ElectricCar( String color){
        this.color = color;
    }

    @Override
    public String getInfo(){
       return "type: electriccar" + "\ncolor: " + color + "\n";
    }
    @Override
    public void charge(){
        System.out.println("charging");
    }
    @Override
    public double calculateFuelEfficency(){
        return ecarfe;
    }
    @Override
    public String lpkm(){
        return "kwh/km";
    }
}
