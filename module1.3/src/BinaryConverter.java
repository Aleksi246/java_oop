import java.lang.reflect.Type;
import java.util.Scanner;

public class BinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            //System.out.println('1'-48);
            //System.out.println('0'-48);


            //String test = "1234";
            //System.out.println(test.length());
            //System.out.println((test.charAt(3)));

            System.out.print("binary number: ");
            String binary = scanner.next();


            int baseten = 0;
            int p = 0;
            for (int i = binary.length() - 1; i >= 0; i--) {
                baseten += (binary.charAt(i) - 48) * Math.pow(2, p);
                p++;
            }
            System.out.println(baseten);
        }
    }
}