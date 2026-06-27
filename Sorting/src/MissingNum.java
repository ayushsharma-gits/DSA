import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingNum {
    static void main(String[] args) {
        int[] arr={0,2,5,3,1};
        //sorting the arr and returning it

        System.out.println(missingNumber(arr));

    }static int missingNumber(int[] nums) {
        int i=0;
        while (i < nums.length) {
            int correct=i;
            if (nums[i]< nums.length && nums[i] !=nums[nums[correct]]){
                int temp =nums[nums[correct]];
                nums[nums[correct]]=nums[i];
                nums[i]=temp;
            }else {
                i++;
            }

        }
        List<Integer> ans =new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
        if (nums[index] !=index) {
            return index;
        }
        }
        return nums.length;
    }
}
