import java.util.ArrayList;

public class ArrayListHandlerTest2 implements Runnable {
    private ArrayList<String> list;

    public ArrayListHandlerTest2(ArrayList<String> list){
        this.list = list;
    }
    public void run(){
        for (int i = 0; i < 500; i++) {
            ArrayListHandler.remove(list,""+i);
        }
    }
}
