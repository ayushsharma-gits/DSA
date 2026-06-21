public class Coin {
    static void main(String[] args) {

    }public int arrangeCoins(int n) {
        int s=1;
        int count=0;

        while(s<n){

            if (s<=n){
                n=n-s;
                s++;
                count++;

            }else{
                return count;
            }
        }
        return count;

    }
}
