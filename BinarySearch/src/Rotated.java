public class Rotated {
    public static void main(String[] args) {
        int[] arr={5,1,3};
        int target=5;
        System.out.println(Mountain(arr,target));



    }

    static int Mountain(int[] nums,int target){
        int s=0;
        int e= nums.length-1;
        int pivot=-1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (mid==nums.length-1 ){
                s=0;
            }
            else if  ( nums[mid] > nums[mid + 1]) {
                e = mid-1;
            } else {
                s = mid;
            }
        }
        pivot = s;
        int start=0;
        int end = nums.length-1;
        if(nums[end] < target){
             end=pivot;
        }
        else if (pivot== nums.length-1){
            start=0;
        }else {
            start=pivot+1;
        }

        int s1=start;
        int e1= end;
        while (e1>=s1) {
            int mid = s1 + (e1-s1) / 2;
            if (target > nums[mid]) {
                s1 = mid + 1;
            }
            else if (target < nums[mid]) {
                e1 = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
