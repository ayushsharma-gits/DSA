public class Mountain {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,7,5,4,3,2};
        int target=67;
        System.out.println(Mountain(arr));

    }
    static int Mountain(int[] arr){
        int s=0;
        int e= arr.length-1;
        while (e>s) {
            int mid = s + (e-s) / 2;
            if (arr[mid+1] > arr[mid]) {
                s=mid+1;
            }
            else {
             e=mid;
            }
        }

        return e;
    }

}
