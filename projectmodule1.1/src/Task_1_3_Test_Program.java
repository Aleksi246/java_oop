public class Task_1_3_Test_Program {
    public static void main(String[] args){
        Customer customer1 = new Customer();
        Customer customer2 = new Customer();
        Customer customer3 = new Customer();

        customer1.displayInfo();
        customer2.displayInfo();
        customer3.displayInfo();

        customer1.setStartTime();
        customer1.setEndTime();
        customer1.setId(6);
        System.out.println(customer1.getStartTime());
        customer1.setEndTime();
        System.out.println(customer1.getEndTime());
        System.out.println(customer1.getId());

        customer1.displayInfo();



    }
}
