public class Unique {
    static void main(String[] args) {
        int[] arr={2,3,3,4,2,6,4};
        System.out.println(ans(arr));
    }
    static int ans(int[] nums){
        int unique=0;
        for (int n :nums){
            unique^=n;
        }
        return unique;
    }
}
