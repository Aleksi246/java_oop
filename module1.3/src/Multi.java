import java.util.Scanner;

public class Multi {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (true){

            int points = 0;
            for(int i = 1; i <= 10; i++){

                int num1 = (int) (Math.random() * 10) + 1;
                int num2 = (int) (Math.random() * 10) + 1;

                System.out.printf("%d * %d = ",num1,num2);
                int anwser = Integer.parseInt(scanner.next());
                if(anwser == num1*num2){
                    points++;
                    System.out.println("oikein");
                }
                else{
                    System.out.println("väärin");
                }



            }
            if(points == 10){
                System.out.println("voitit pelin!");
                System.exit(0);
            }
            else {
                System.out.println("yritä uudestaan :(");
            }






        }

    }
}
