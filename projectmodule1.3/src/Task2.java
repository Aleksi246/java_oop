import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

        double rand;
        int[] lista = new int[1000];
        double countof18 = 0;
        double countof19 = 0;
        double countof20 = 0;

        for(int i = 0; i < 1000; i++){
            rand = Math.random();
            if(rand < 0.1){
                lista[i] = 18;
            }
            if(0.1 <= rand && rand < 0.5){
                lista[i]= 19;
            }
            if(0.5 <= rand){
                lista[i]= 20;
            }

        }
        for(int k: lista){
            if(k == 18){
                countof18++;
            }
            if(k == 19){
                countof19++;
            }
            if(k == 20){
                countof20++;
            }
        }
        System.out.println(countof18/1000);
        System.out.println(countof19/1000);
        System.out.println(countof20/1000);
        //System.out.println(Arrays.toString(lista));


    }
}
