public class MinRotation {
    static void main(String[] args) {
        int[] arr={3,1,2};
        int target=5;
        System.out.println(findMin(arr));

    }static int findMin(int[] nums) {
        int s=0;
        int e= nums.length-1;
        while (s < e) {
            int mid = s + (e - s) / 2;

            if (nums[mid] > nums[e]) {
                s = mid + 1;
            } else {
                e = mid;
            }
        }

        return nums[s];
    }
}
