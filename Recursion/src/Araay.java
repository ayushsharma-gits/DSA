import java.util.Arrays;

import static java.util.Arrays.*;

public class Araay {
    static void main(String[] args) {
        int[] arr={0,2,1,5,3,4};
        System.out.println(Arrays.toString(buildArray(arr)));

    }static int[] buildArray(int[] nums) {
        int[] num2=  Arrays.copyOf(nums, nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=i){
                num2[i]=nums[nums[i]];
            }
        }
        return num2;
    }
}
