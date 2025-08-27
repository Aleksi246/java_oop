public class CoffeeMakerDriver {
    static void printstate(boolean bool){
        if(bool){
            System.out.println("coffee maker is on");
        }
        else{
            System.out.println("coffee maker is off");
        }
    }

    public static void main(String[] args) {
        CoffeeMaker coffeemaker = new CoffeeMaker();



        coffeemaker.toggle();
        printstate(coffeemaker.isOn());

        coffeemaker.selectCoffee("espresso");
        System.out.println("coffee type is " + coffeemaker.getCoffeeType());

        coffeemaker.selectAmount(50);
        System.out.println("coffee amount is " + coffeemaker.getAmount() + " ml");

        coffeemaker.toggle();
        printstate(coffeemaker.isOn());




    }




}


