/* Define a class Car (convention capitalizes class names).
 * Car is public (as classes usually are, more on this later).
 */
public class Car {
    /* An object of class Car will have instance variables speed and gasolineLevel.
     * Both are private (they can not be accessed outside the class methods).
     * Keep instance variables private whenever possible.
     */
    private double speed;
    private double gasolineLevel;
    private String typeName;
    private double TankCapasity;

    private double targetSpeed;
    private boolean cruiseControlState;


    /* This is the method (constructor) called when a new instance of Car is created (with new).
     * Constructors may also have arguments.
     */
    public Car(String typeName) {
        speed = 0; gasolineLevel = 0;
        this.typeName = typeName;   // this refers to the object itself.
        // The reference is useful if you want to use parameter names that are
        // identical to instance variable names (and for more, later on)
    }
    public Car(String typeName,double speed,double TankCapasity){
        gasolineLevel = 0;
        this.typeName = typeName;
        this.speed = speed;
        this.TankCapasity = TankCapasity;
    }

    /* Implementations of some methods.
     * Note that methods refer to and change instance variable values.
     */
    public void accelerate() {
        if (gasolineLevel > 0)
            speed += 10;
        else
            speed = 0;
    }
    void decelerate(double amount) {
        if (gasolineLevel > 0) {
            if (amount > 0)
                speed = Math.max(0, speed - amount);
        } else
            speed = 0;
    }


    public void setTarget(int target){
        if(0 < target && target < 120){
        targetSpeed = target;
        }
        else{
            System.out.println("target speed outside bounds");
        }
    }

    public double getTarget(){
        return targetSpeed;
    }

    public void toggleCruise(){
        cruiseControlState = !cruiseControlState;
    }


    double getSpeed() {
        return speed;
    }

    public void Cruising(){
        if(cruiseControlState) {
            if(targetSpeed < 0){
                System.out.println("taget speed not set");
                return;
            }
            while(speed < targetSpeed){
                this.accelerate();
            }
            if(speed > targetSpeed){
                this.decelerate(speed-targetSpeed);
            }




        }

    }


    String getTypeName() {
        return typeName;
    }
    void fillTank() {
        gasolineLevel = 100;
    }
    double getGasolineLevel() {
        return gasolineLevel;
    }
}