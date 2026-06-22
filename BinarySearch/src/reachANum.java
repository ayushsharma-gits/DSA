public class reachANum {
    static void main(String[] args) {
        int target =4;
        System.out.println(reachNumber(target));

    }static int reachNumber(int target) {
        int s=0;
        int count=0;
        int e =  Math.abs(target);
        int num=0;
        while(e>=s){
            count++;
            s=count;
            if (num+s==Math.abs(target)){
                break;
            }
            else if (num+s>Math.abs(target)){
                num=num-s;
            }else{
                num=num+s;
            }

        }
        return s;
    }
}
