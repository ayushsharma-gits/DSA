public class SqrR {
    static void main(String[] args) {
        int x=16;
        System.out.println();

    }
    class Solution {
        public int mySqrt(int x) {
            int s = 0;
            int e = x;
            while ( e>s ) {
                int mid = (s+e)/2;
                if (mid*mid>x){
                    e =mid-1;
                }if (mid*mid<x){
                    s =mid+1;
                }
                else{
                    return mid;
                }

            }
            return e;
        }
    }
}
