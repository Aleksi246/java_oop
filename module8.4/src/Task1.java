public class Task1 {

    public static int calculate(int index, int sum, int[] array){
        sum += array[index];

        if(index < array.length -1){
            return calculate(index+1,sum,array);
        }
        return sum;

    }
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7,8,9,10};

        int ret = calculate(0,0,nums);
        System.out.println(ret);
    }
}
