abstract class AbstractVehicle implements Vehicle, ElectricVehicle{
    double ecarfe = 251;
    double emotofe = 25;

    double carfe = 252;
    double motofe = 25;
    double busfe = 25;

    @Override
    public void start(){
        System.out.println(this.getClass().getName() + " is starting");
    }
    @Override
    public void stop(){
        System.out.println(this.getClass().getName() + " is stopping");
    }

    @Override
    public void charge(){
        System.out.println("not possible to charge");
    }

    @Override
    public String lpkm(){
        return "";
    }

}
