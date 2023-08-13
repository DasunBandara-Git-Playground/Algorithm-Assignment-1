import java.util.Arrays;

public class Algo_3 {
    public static void main(String[] args) {

        int[] nums = {10, 20, 30, 40, 50};

        int[] numsNew = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            numsNew[i] = nums[nums.length-1-i];
        }
        nums = numsNew;
        String numsString = "[";
        for (int i = 0; i < nums.length; i++) {
            numsString += nums[i]+", ";
        }
        System.out.println(numsString+"\b\b]");
    }
}
