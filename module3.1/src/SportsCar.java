public class SportsCar extends Car {
    //tehtävän anto oli mielestäni huono. En tiädä käytinkö väärää Car luokkaa, mutta löytämässäni Car luokassa ei ollut ollenkaan bensan kulutusta ja hidastus oli välitöntä eli sitä ei voinut parantaa.


    public SportsCar(String typeName,double speed,double TankCapasity){
        super(typeName,speed,TankCapasity);
        //had to change some class variables to protected instead of private in Car class
        gasolineLevel = 0;
    }

    @Override
    public void accelerate() {
        if (gasolineLevel > 0) {
            //speed grows faster 20 instead of 10
            speed += 20;
            gasolineLevel -= 1;
        }
        else{
            speed = 0;
        }
    }
    //no point in override as deceleration is already instant
    @Override
    void decelerate(double amount) {
        if (gasolineLevel > 0) {
            if (amount > 0)
                speed = Math.max(0, speed - amount);
        } else
            speed = 0;
    }

}
