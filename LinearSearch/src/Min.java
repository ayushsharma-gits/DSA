public class Min {
    static void main(String[] args) {
        int[] arr ={2,3,56,76,34,23,25};
        int sol = Minimum(arr);
        System.out.println(sol);

    }
    static int Minimum(int arr[]){
        int l =arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (l>arr[i+1]){
                l=arr[i+1];
            }
            return l;

        }
        return l;
    }
}
