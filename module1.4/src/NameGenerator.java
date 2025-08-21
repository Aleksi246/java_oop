import java.util.Scanner;

public class NameGenerator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] firsts = {"Jonne","Veeti","Roope","Aku","Milla","Tupu","Hupu","Lupu",};
        String[] lasts = {"Ankka","Hanhi","Maija","Rosvo","Hiiri","Seppä"};

        System.out.print("montako nimeä?  ");
        int montako = Integer.parseInt(scanner.next());

        for(int i = 0; i != montako; i++){
            int num1 = (int) (Math.random() * firsts.length) ;
            int num2 = (int) (Math.random() * lasts.length);

            String full = firsts[num1] +" "+ lasts[num2];
            System.out.println(full);
        }

    }
}
