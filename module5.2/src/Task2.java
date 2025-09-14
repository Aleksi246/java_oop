import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        ArrayListHandlerTest tester = new ArrayListHandlerTest(lista);
        ArrayListHandlerTest2 tester2 = new ArrayListHandlerTest2(lista);

        Thread worker1 = new Thread(tester);
        Thread worker2 = new Thread(tester);

        Thread worker3 = new Thread(tester2);
        Thread worker4 = new Thread(tester2);

        worker1.start();
        worker2.start();

        try{
            worker1.join();
            worker2.join();
        }catch(Exception e){

        }
        System.out.println(ArrayListHandler.size(lista));

        worker3.start();
        worker4.start();

        try{
            worker3.join();
            worker4.join();
        }catch(Exception e){

        }
        System.out.println(ArrayListHandler.size(lista));


    }
}
