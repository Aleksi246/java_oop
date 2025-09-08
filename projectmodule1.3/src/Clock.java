public class Clock {
    private static Clock instance;
    private static int time;

    private Clock(){
    }

    public static int getTime(){
        return time;
    }
    public static void setTime(int time){
        Clock.time = time;
    }
    public static Clock getInstance(){
        if (instance == null) {
            instance = new Clock();
        }
        return instance;
    }
}

