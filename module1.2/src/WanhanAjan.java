import java.util.Scanner;

public class WanhanAjan {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("paino (g): ");
        Double grammat = Double.parseDouble(scanner.next());


        //luoti    = 13.28 g
        //naula    = 32*luoti = 32*13.28 g
        //leiviskä = 20*naula = 20*32*13.28 g

        Double leiviskät = Math.floor(grammat/(13.28*32*20));
        Double naulat = Math.floor((grammat-(leiviskät*13.28*32*20))/(13.28*32));
        Double luodit = ((grammat-(leiviskät*13.28*32*20)-(naulat*13.28*32))/13.28);

        System.out.printf("%f grammaa on: %.0f leiviskää, %.0f naulaa ja %.2f luotia",grammat,leiviskät,naulat,luodit);
    }
}
