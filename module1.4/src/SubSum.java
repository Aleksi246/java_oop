import java.util.Scanner;

public class SubSum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of intigers in array: ");
        int elements = Integer.parseInt(scanner.next());

        int[] lista = new int[elements];

        for(int i = 0; i < elements; i++){
            System.out.printf("enter integer %d: ",(i+1));
            int element = Integer.parseInt(scanner.next());
            lista[i] = element;
        }
        int maxsum = lista[0];
        String väli = "";




        for(int subarraylenght = 1; subarraylenght <= elements; subarraylenght++){

        for(int i = 0; i <= elements-subarraylenght; i++) {
            int sum = 0;
            for (int j = 0; j < subarraylenght; j++) {
                sum += lista[i + j];
            }
            if (sum > maxsum) {
                maxsum = sum;
                väli = String.valueOf(i+1) + "-" + String.valueOf(i + subarraylenght);
            } else if (sum == maxsum) {
                väli +=" "+ String.valueOf(i+1) + "-" + String.valueOf(i + subarraylenght);
            }
        }

        }
        System.out.println(maxsum);
        System.out.println(väli);



    }
}
