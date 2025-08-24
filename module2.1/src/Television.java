public class Television {

    private int channel;
    //state 1 = on 0 = off
    private boolean state = false;

    public void setChannel(int k){
        if(k>10){
            k = 1;
        }
        channel = k;
    }
    public int getChannel(){
        return channel;
    }
    public void pressOnOff() {
        state = !state;
    }
    public boolean isOn(){
        return state;
    }



    }


