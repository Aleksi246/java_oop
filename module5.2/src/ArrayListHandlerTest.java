import java.util.ArrayList;

public class ArrayListHandlerTest implements Runnable {
    private ArrayList<String> list;

    public ArrayListHandlerTest(ArrayList<String> list){
        this.list = list;
    }
    public void run(){
        for (int i = 0; i < 1000; i++) {
            ArrayListHandler.add(list,""+i);
        }
}
}
