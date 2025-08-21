import java.util.Scanner;

public class PrimeGenerator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("start: ");
        int start = Integer.parseInt(scanner.next());
        System.out.print("stop: ");
        int stop = Integer.parseInt(scanner.next());

        if(stop < start){
            System.out.print("stop was smaller than start aborting");
            System.exit(0);
        }



        for(int i = start; i <= stop; i++){
            int raja = (int)(Math.ceil(Math.sqrt(i)));


            for(int j = 2; j <= raja; j++ ){

                if(i%j != 0){
                    if(j == raja){
                        System.out.println(i);
                    }
                    continue;
                }
                else {
                    if(j==i){
                        System.out.println(i);
                    }
                    break;
                }
            }

        }



    }
}
