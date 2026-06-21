public class insertPosition {
    static void main(String[] args) {
        int[] arr={1,4,5,6};
        int target=0;
        System.out.println(searchInsert(arr,target));

    }public static int searchInsert(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;
        while (e >= s) {

            int mid = s + (e - s) / 2;
            if (target > nums[nums.length - 1] ){
                return nums.length;
            }if (target < nums[0] ){
                return 0;
            }
            if (target > nums[mid] && target < nums[mid+1]){
                return mid+1;
            }if (target < nums[mid] && target > nums[mid-1]){
                return mid-1;
            }

            if (target > nums[mid]) {
                s = mid + 1;
            }
            else if  (target < nums[mid]) {
                e = mid - 1;
            }
            else {
                return mid;
            }
        }

        return -1;
    }
}
