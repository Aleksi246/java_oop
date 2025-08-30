public class Circle extends Shape {
    private double r;

    public Circle(double r,String color){
        super(color);
        this.r = r;
    }

    @Override
    public double calculateArea(){
        return Math.PI*r*r;
    }
    @Override
    public String toString(){
        return "area of circle with radius " + this.r + ": " + this.calculateArea();
    }
}
