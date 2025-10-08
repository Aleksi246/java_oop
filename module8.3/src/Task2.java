import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface Addable {
    int add(int a,int b);
}

public class Task2 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(10, 5, 8, 20, 15, 3, 12));

        nums.removeIf(n -> n % 2 == 0);
        nums.replaceAll(n -> n * 2);

        int sum = 0;
        for(int i : nums){
            sum += i;
        }



        System.out.println(nums);
        System.out.println(sum);
    }
}
