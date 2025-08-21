import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("kanttin pituus: ");
        Double kantti = Double.parseDouble(scanner.next());

        System.out.print("kyljen pituus: ");
        Double kylki = Double.parseDouble(scanner.next());

        Double hypotenuusa = Math.sqrt(Math.pow(kantti,2)+Math.pow(kylki,2));

        System.out.printf("hypotenuusan pituus: %f",hypotenuusa);


    }
}
