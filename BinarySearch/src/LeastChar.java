public class LeastChar {
    public static void main(String[] args) {
        char[] arr={'a','b','c','e','g','h','m','u','z'};
        char target='d';
        System.out.println(Ceil(arr,target));

    }
    static int Ceil(char[] arr,char target){
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
