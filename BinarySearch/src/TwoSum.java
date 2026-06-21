public class TwoSum {
    static void main(String[] args) {

    }class Solution {
        public int[] twoSum(int[] numbers, int target) {
            int s=0;
            int e= numbers.length-1;
            while(e>s){
                if (numbers[0]+numbers[e]>target){
                    e=e-1;
                }if (numbers[0]+numbers[e]==target){
                    return new int[]{s+1,e+1};
                }else{
                    s=s+1;
                }
            }
            return new int[]{-1,-1};

        }
    }
}
