public class ElectricMotorcycle extends AbstractVehicle{
    String color;


    public ElectricMotorcycle(String color){
        this.color = color;
    }

    @Override
    public String getInfo(){
        return "type: electricmotorcycle " + "\ncolor: " + color + "\n";
    }
    @Override
    public void charge(){
        System.out.println("charging");
    }
    @Override
    public double calculateFuelEfficency(){
        return emotofe;
    }
    @Override
    public String lpkm(){
        return "kwh/km";
    }
}
