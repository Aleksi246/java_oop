public class Rectangle extends Shape{
    private double widht;
    private double height;

    public Rectangle(double widht,double height,String color){
        super(color);
        this.widht = widht;
        this.height = height;
    }

    @Override
    public double calculateArea(){
        return widht*height;
    }
    @Override
    public String toString(){
        return "area of rectangle with widht " + this.widht + " and height " +this.height + ": " + this.calculateArea();
    }
}
