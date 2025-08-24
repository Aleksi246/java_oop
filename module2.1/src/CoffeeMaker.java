public class CoffeeMaker {

    //state  1 = on 0 = off
    private boolean state;
    //type is the type of coffee 1 for normal 2 for expresso
    private String type;
    //amount is ml of coffee
    private int amount;

    public void toggle(){
        state = !state;
    }
    public boolean isOn(){
        return state;
    }
    public void selectCoffee(String coffeetype){
        type = coffeetype;
    }





}
