import java.util.*;

public class SubTasks {
    public static void main(String[] args) {
        //задание 2
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = ((int) (Math.random()*100));
        }

        Arrays.sort(nums);

        //задание 3
        Integer[] numsRevers = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numsRevers[i] = nums[i];
        }
        Arrays.sort(numsRevers, Collections.reverseOrder());

        //задание 4


        Stack stack = new Stack<>();

        Scanner sc = new Scanner(System.in);
        int numbers [] = new int[10];
        for(int i = 0; i <numbers.length; i++){
            numbers[i]= Integer.parseInt(sc.next());
        }


        for(int j = 0; j<numbers.length; j++) {
            stack.addElement(numbers[j]);
        }


    }

}
