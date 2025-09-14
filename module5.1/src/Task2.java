import java.util.ArrayList;

public class Task2 extends Thread{
    private int sum = 0;
    private int startindex;
    private int endindex;
    int[] array;

    public Task2(int[] array, int start, int end){
        this.array = array;
        this.startindex = start;
        this.endindex = end;
    }

    public void run(){
        for(int i = startindex ; i < endindex; i++){
            sum += array[i];
        }
    }

    public int getSum(){
        return sum;
    }


}
class Main {
    public static void main(String[] args) {
        int sizeofarray = 100000000;
        int[] array = new int[sizeofarray];

        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("cores: " + cores);

        for(int i = 0; i < sizeofarray; i++){
            array[i] = (int) (Math.random()*10);
        }
        // sanity check
        int sanitysum = 0;

        long starttime = System.nanoTime();
        for(int k: array){
            sanitysum += k;
        }
        long endtime = System.nanoTime();
        System.out.println("sanity chack: " + sanitysum);
        System.out.println("time: " + (endtime-starttime)/10e6 + " ms");
        System.out.println();



        double sizeofslice = (double) sizeofarray/cores;

        ArrayList<Task2> workers = new ArrayList<>();

        //divide the array into parts
        for(int n = 0; n < cores; n++){
            int slicestart = (int)Math.round(n*sizeofslice);
            int sliceend = (int)Math.round((n+1)*sizeofslice);
            if(n == cores - 1){
                sliceend = sizeofarray;
            }
            workers.add(new Task2(array,slicestart,sliceend));
        }


        long starttime2 = System.nanoTime();
        for(Task2 worker: workers){
            worker.start();
        }

        int sum2 = 0;
        for(Task2 worker: workers){
            try {
                worker.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sum2 += worker.getSum();
        }
        long endtime2 = System.nanoTime();

        System.out.println("sum: " + sum2);
        System.out.println("time: " + (endtime2-starttime2)/10e6 + " ms");



    }
}
