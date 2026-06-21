public class TrueSqr {
    static void main(String[] args) {

    }class Solution {
        public boolean isPerfectSquare(int num) {
            int s=0;
            int e=num;
            while(e>s){
                int mid = s + (e-s)/2;
                if (mid*mid==num){
                    return true;
                }
                if (mid*mid>num){
                    e=mid-1;
                }else{
                    s=mid+1;
                }
            }
            return false;

        }
    }
}
