public class Bus extends Car{
    private int passangerCount;

    public Bus(String typeName,double speed,double TankCapasity, int passangerCount){
        super(typeName,speed,TankCapasity);
        gasolineLevel = 0;
        this.passangerCount = passangerCount;

    }
    public void passengerEnter(){
        passangerCount += 1;
    }

    public void passengerExit(){
        if(passangerCount >= 1) {
            passangerCount -= 1;
        }
    }

}
