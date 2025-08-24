import java.util.Scanner;

public class RemoveDu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of intigers in array: ");
        int elements = Integer.parseInt(scanner.next());

        int[] lista = new int[elements];

        int size = elements;

        for (int i = 0; i < elements; i++) {
            System.out.printf("enter integer %d: ", (i + 1));
            int element = Integer.parseInt(scanner.next());
            lista[i] = element;
            }

        int[] lista2 = new int[elements];

        int laskuri = 0;

        for(int j = 0; j < elements; j++){
            boolean duplicates = false;
            for(int k = 0; k < elements; k++){
                if(lista[j] == lista2[k]){
                    duplicates = true;
                }


            }

            if(duplicates == false){
                lista2[laskuri] = lista[j];
                laskuri++;
            }


        }



        for(int a = 0; a < lista2.length; a++){

                System.out.print(lista2[a]);
                System.out.print(" ");


        }
/*


        for(int n = 0; n < lista.length; n++){
            for(int k = n+1; k < lista.length; k++){
                if(lista[n] == lista[k]){
                    size--;
                    break;
                }

            }

        }

        int[] lista2 = new int[size];
        System.out.println(size);
        int g = 0;

        for(int f = 0; f < elements; f++){
            if(lista[f] != lista2[g]){
                lista2[g] = lista[f];
                g++;
            }

            }*/

        }


        }
