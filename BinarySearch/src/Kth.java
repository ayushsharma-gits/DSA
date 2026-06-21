public class Kth {
    static void main(String[] args) {
        int k=5;
        int[] arr ={1,2,4,7,8};
        System.out.println(findKthPositive(arr,k));

    }public static int findKthPositive(int[] arr, int k) {
        int s=0;
        int e= arr.length-1;
        int count=k;
        int ans =0;
        for (int i = 1; count >0; i++) {
            while (e>=s) {
                int mid = s + (e-s) / 2;
                if (i > arr[mid]) {
                    s = mid + 1;
                }
                else if (i < arr[mid]) {
                    e = mid - 1;
                } else {
                    count++;
                    break;
                }

            }
            ans++;
            s=0;
            e= arr.length-1;

            count--;


        }
        return ans;

    }
}
