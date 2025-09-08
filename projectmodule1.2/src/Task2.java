public class Task2 {
    public static void main(String[] args) {

        for(int i = 0; i < 30; i++){
            int temp = (int)(Math.random()*10 +1);
            if(temp <= 5){
                EventList.eventlist.add(new Event(temp,EventType.ARRIVAL));
            }else{
                EventList.eventlist.add(new Event(temp,EventType.EXIT));
            }
        }
        EventList.eventlist.remove(EventList.eventlist.peek());
        while(!EventList.eventlist.isEmpty()){
            System.out.println(EventList.eventlist.peek());
            EventList.eventlist.remove(EventList.eventlist.peek());
        }

    }
}
