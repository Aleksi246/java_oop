public class CustomerGenerator {

    public static void generateCustomersToList(int amount){
        for(int i = 0; i < amount; i++){
            ServicePoint.addToQue(new Customer());
        }
    }
}
