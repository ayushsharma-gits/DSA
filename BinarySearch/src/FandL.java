import java.util.Arrays;

public class FandL {
    public static void main(String[] args) {
        int[] arr={1};
        int target=1;
        System.out.println(Arrays.toString(searchRange(arr,3)));

    }
    static int SecondStart(int[] arr,int f){
        int s=0;
        int e= f-1;
        while (e>=s) {
            int mid = s + (e-s) / 2;
            if (arr[f] > arr[mid]) {
                s = mid + 1;
            }
            else if (arr[f] < arr[mid]) {
                e = mid - 1;
            } else {
                return mid;
            }
        }


        return f;

    }
    static int SecondEnd(int[] arr,int f){
        int s=f+1;
        int e= arr.length-1;
        while (e>=s) {
            int mid = s + (e-s) / 2;
            if (arr[f] > arr[mid]) {
                s = mid + 1;
            }
            else if (arr[f] < arr[mid]) {
                e = mid - 1;
            } else {
                return mid;
            }

        }


        return f;

    }
    static int[] searchRange(int[] nums, int target){
        int[] ans ={-1,-1};
        int s=0;
        int e= nums.length-1;
        int f=0;
        int start=0;
        int last=0;
        while (e>=s) {
            int mid = s + (e-s) / 2;
            if (target > nums[mid]) {
                s = mid + 1;
            }
            else if (target < nums[mid]) {
                e = mid - 1;
            } else {
                f= mid;
                break;
            }
        }
        int starts=0;
        int starte= f-1;
        while (starte>=starts) {
            int mid = starts + (starte - starts) / 2;
            if (nums[f] > nums[mid]) {
                starts = mid + 1;
            } else if (nums[f] < nums[mid]) {
                starte = mid - 1;
            } else {
                start = mid;
                break;
            }
            start=f;
        }

            int lasts=f+1;
            int laste= nums.length-1 ;
            while (laste>=lasts) {
                int mid = lasts + (laste-lasts) / 2;
                if (nums[f] > nums[mid]) {
                    s = mid + 1;
                }
                else if (nums[f] < nums[mid]) {
                    laste = mid - 1;
                } else {
                    last =mid;
                    break;
                }
                last=f;
            }
            if (start==-1 || last==-1){
                return new int[]{-1,-1};
            }else{
                return new int[]{start,last};
            }





    }
}
