public class Main {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,45,67,89};
        int target=67;
        System.out.println(BiSearch(arr,target));

    }
    static int BiSearch(int[] nums,int target){
        int s=0;
        int e= nums.length-1;
        while (e>=s) {
            int mid = s + (e-s) / 2;
            if (target > nums[mid]) {
                s = mid + 1;
            }
            else if (target < nums[mid]) {
                e = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
