import java.util.ArrayList;

public class ShapeCalculator {
    public static void main(String[] args){
        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle(1,"green"));
        shapes.add(new Circle(3,"yellow"));
        shapes.add(new Triangle(2,3,"red"));
        shapes.add(new Rectangle(2,3,"brown"));


        for(Shape shape: shapes){
            System.out.println(shape +" color: "+ shape.getColor());
        }
    }
}
