import java.util.Scanner;


public class FaToC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("give temperature in fahrenheit: ");
        Double temp = Double.parseDouble(scanner.next());

        double celc = (temp-32)/1.8;

        System.out.printf("%f fahrenheit is %.1f celsius",temp,celc);

    }

}
