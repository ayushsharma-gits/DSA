public class FirstBad {
    static void main(String[] args) {

    }public class Solution  {
        public int firstBadVersion(int n) {

            int s=0;
            int e=n;
            while(e>=s){
                int mid = s +(e-s)/2;
                boolean isBadVersion=isBadVersion(n);
                if(isBadVersion(mid)==true){
                    if (isBadVersion(mid-1)==false){
                        return mid;
                    }else {
                        e=mid-1;
                    }
                }
                if(isBadVersion(mid)==false){
                    if (isBadVersion(mid+1)==true){
                        return mid+1;
                    }else {
                        s=mid+1;
                    }
                }else {
                    return -1;
                }
            }
            return -1;

        }
    }
}
