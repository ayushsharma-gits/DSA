public class GuessGame {
    static void main(String[] args) {

    }
    public class Solution extends GuessGame {
        public int guessNumber(int n) {
            int s=1;
            int e=n;

            while(e>=s){
                int mid =s+(e-s)/2;
                int guess= guess(mid);
                if (guess==0 ){
                    return mid;
                }if (guess==-1){
                    e=mid-1;
                }else{
                    s=mid+1;
                }
            }
            return -1;

        }

        private int guess(int mid) {
            int as=1;
            return as;
        }
    }
}
