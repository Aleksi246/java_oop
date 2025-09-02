public class Task_1_6_Program {
    public static void main(String[] args) {
        //average service time is the (sum of each customers time)/(amount of customers)

        int amount = 10;
        int tests = 10;

        for(int i = 0; i < tests; i++){
            CustomerGenerator.generateCustomersToList(amount);
            long sumOfWaits = ServicePoint.serve();
            System.out.println("average service time: " + sumOfWaits/amount + " ms");
        }



    }
}
