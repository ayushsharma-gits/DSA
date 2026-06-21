import java.util.Arrays;

public class GreaterthanTarget {
    static void main(String[] args) {
        char taget='d';
        char[] arr ={'c','f','g','z'};
        System.out.println(nextGreatestLetter(arr,taget));

    }public static char nextGreatestLetter(char[] letters, char target) {
        int s=0;
        int e= letters.length-1;
        int ans=0;

            while (e>=s) {
                int mid = s + (e - s) / 2;
                if (letters[mid] > target) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            }
            if(s == letters.length){
                return letters[0];
            }
            return letters[s];


    }
}
