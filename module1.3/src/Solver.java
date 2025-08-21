import java.util.Scanner;

public class Solver {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("a: ");
        Double a = Double.parseDouble(scanner.next());

        System.out.print("b: ");
        Double b = Double.parseDouble(scanner.next());

        System.out.print("c: ");
        Double c = Double.parseDouble(scanner.next());

        Double discriminant = Math.pow(b,2)-(4*a*c);

        if (discriminant < 0) {
            System.out.println("no real roots");
        }
        else if(a == 0) {
            //when a == 0 this is just a equation for a line
            System.out.printf("%fx + %f = 0 when x = %f",b,c,(-c/b));
        }
        else if(discriminant == 0 ){
            //when discriminant == 0 there is only one real root
            System.out.printf("%fx^2 + %fx + %f = 0 when x = %f",a,b,c,(-b/(2*a)));
        }
        else{
            System.out.printf("%fx^2 + %fx + %f = 0 when x = %f or x = %f",a,b,c,((-b+Math.sqrt(discriminant))/(2*a)),((-b-Math.sqrt(discriminant))/(2*a)));
        }


    }
}
