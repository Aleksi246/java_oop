public class Pen {


    public enum Color {
        RED("red"), GREEN("green"), BLUE("blue");
        private final String color;
        Color(String color) { this.color = color; };
        @Override public String toString() { return color; }
    }

    private Color color = Color.RED;
    private boolean capOn = true;

    public Pen(){}

    public Pen(Color color){
        this.color = color;
    }
    public void capOff(){
        capOn = false;
    }
    public void capOn(){
        capOn = true;
    }
    public String draw(){
        if(!capOn){
            return "Drawing " + this.color;
        }else return "";
    }

    public void changeColor(Color color){

        if(capOn){
        this.color = color;
        }
    }


    // your code here
}