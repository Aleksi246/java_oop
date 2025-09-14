public class Task1 extends Thread{
    private int end;
    private int start;

    public Task1(int start, int end){
        this.start = start;
        this.end = end;
    }
    public void run(){
        while(start <= end) {
            System.out.println(start);
            start += 2;
        }
    }

    public static void main(String[] args) {
        int ending = 100;
        new Task1(0,ending).start();
        new Task1(1,ending).start();

    }
}
