import java.util.LinkedList;

public class ServicePoint {
    private static LinkedList<Customer> customers = new LinkedList<>();

    public static void addToQue(Customer a){
        a.setStartTime();
        customers.addFirst(a);
    }
    private static Customer removeFromQue(){
        Customer b = customers.getLast();
        b.setEndTime();
        customers.removeLast();
        return b;
    }
    public static long serve() {
        long sumOfWaits = 0;
        while(!customers.isEmpty()){
            // sleeptime is between 0 and x sec ad 1000 ms = 1 s
            long sleepTime =(long) (Math.random()*2000);
            //System.out.println("sleeptime: "+ sleepTime + " ms");
            try{
                Thread.sleep(sleepTime);
            } catch(InterruptedException e){
                e.printStackTrace();
            }


            Customer c = removeFromQue();
            long deltaTime = (c.getEndTime() - c.getStartTime())/1000000;
            System.out.println("time in que: " + deltaTime + " ms");
            sumOfWaits += deltaTime;
        }
        return sumOfWaits;
    }

}
