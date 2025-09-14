import java.util.ArrayList;

class ArrayListHandler{

    public static synchronized void add(ArrayList<String> a, String b){
        a.add(b);
    }
    public static synchronized boolean remove(ArrayList<String> a, String b){
        return a.remove(b);
    }
    public static synchronized int size(ArrayList<String> a){
        return a.size();
    }



}