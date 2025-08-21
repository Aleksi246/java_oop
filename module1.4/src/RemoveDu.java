import java.util.Scanner;

public class RemoveDu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of intigers in array: ");
        int elements = Integer.parseInt(scanner.next());

        int[] lista = new int[elements];

        int size = 0;

        for (int i = 0; i < elements; i++) {
            System.out.printf("enter integer %d: ", (i + 1));
            int element = Integer.parseInt(scanner.next());
            lista[i] = element;
            }
        }



}