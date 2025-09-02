import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

public class Task_1_4_Program {
    public static void main(String[] args){
        LinkedList<Customer> customers = new LinkedList<>();

        while(true){
            Scanner scanner = new Scanner(System.in);

            System.out.print("press a to add a customer to que or press d to deque a customer from the que ");
            String selected = scanner.next();

            if(Objects.equals(selected, "a")){
                Customer cust = new Customer();
                cust.setStartTime();
                customers.addFirst(cust);
            }
            if(Objects.equals(selected, "d")){
                customers.getLast().setEndTime();
                long deltaTime =  (customers.getLast().getEndTime() - customers.getLast().getStartTime())/100000000;
                System.out.println(deltaTime);
                customers.removeLast();
            }



        }

    }
}
