public class XgreaterthanX {
    static void main(String[] args) {
        int[] nums={3,5};
        System.out.println(specialArray(nums));

    }public static int specialArray(int[] nums) {
        int s=0;
        int e=nums.length-1;
        int target=nums.length;
        int count=0;
        while(e>=s){
            int mid=s+(e-s)/2;
            if (target<=nums[mid]){
                    count++;
                    e=e-1;
            }else{
                s=mid+1;
            }
        }if (count==target){
            return count;
        }else {
            return -1;
        }

    }
}
