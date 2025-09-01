public class Customer {
    private int id;
    private long startTime;
    private long endTime;
    static int count = 1;

    public Customer(){
        this.id = count;
        count++;
    }

    public int getId(){
        return id;
    }
    public long getStartTime(){
        return startTime;
    }
    public long getEndTime(){
        return endTime;
    }

    public void setId(int id){
         this.id = id;
    }
    public void setStartTime(){
        this.startTime = System.nanoTime();
    }
    public void setEndTime(){
        this.endTime = System.nanoTime();
    }

    public void displayInfo(){
        System.out.println("id: " + id + " start time: " + startTime + " end time: " + endTime);
    }




}
