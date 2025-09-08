public class Event implements Comparable<Event> {
    private int eventTime;
    private EventType type;
    static int time = 0;


    public Event(int howsoon, EventType type){
        this.eventTime = howsoon + time;
        this.type = type;
        time = eventTime;
    }

    @Override
    public int compareTo(Event e){
        if (this.eventTime == e.eventTime){
            return 0;
        }
        if (this.eventTime > e.eventTime){
            return 1;
        }
        return -1;
    }

    @Override
    public String toString(){
        return eventTime + " " + type;
    }
}
