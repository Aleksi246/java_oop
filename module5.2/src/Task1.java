import java.util.ArrayList;

public class Task1 {
    private static int tickets;
    private static int sanitycount = 0;

    public Task1(int tick){
        this.tickets = tick;
    }

    public synchronized void withdraw(int amount,int id){
        if(this.tickets - amount >= 0) {
            this.tickets = this.tickets - amount;
            System.out.println("customer " + id + " reserved " + amount + " tickets");
            sanitycount += amount;
        }else System.out.println("cutomer " + id + " could not reserve " + amount + " tickets");
    }

    public int getTick(){
        return tickets;
    }
    public static int getsan(){
        return sanitycount;
    }

}
class Customer implements Runnable{
    private Task1 movieplace;
    static int count = 0;
    private int id;

    public Customer(Task1 movieplace){
        this.movieplace = movieplace;
        count++;
        this.id = count;
    }

    public void run(){
        movieplace.withdraw((int)(Math.random()*3)+1, this.id);
    }

    public int getid(){
        return id;
    }


}
class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        Task1 movietheatre = new Task1(1000);

        ArrayList<Thread> threads = new ArrayList<>();

        for(int i = 0; i < 1000 ; i++){
            customers.add(new Customer(movietheatre));
        }
        for(Customer c: customers){
            Thread b = new Thread(c);
            b.start();
            threads.add(b);
        }
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }




        System.out.println(Task1.getsan());
    }
}
