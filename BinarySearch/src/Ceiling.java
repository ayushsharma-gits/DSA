public class Ceiling {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,45,67,89};
        int target=3;
        System.out.println(Ceil(arr,target));

    }
    static int Ceil(int[] arr,int target){
        int s=0;
        int e= arr.length-1;
        while (e>=s) {
            int mid = s + (e-s) / 2;
            if (target > arr[mid]) {
                s = mid + 1;
            }
            else if (target < arr[mid]) {
                e = mid - 1;
            } else {
                return mid;
            }
        }

        return s;
    }
}
