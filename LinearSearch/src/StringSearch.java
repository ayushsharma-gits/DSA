import java.util.Scanner;

public class StringSearch {
    static void main(String[] args) {
        String arr ="Ayush";
        Scanner input = new Scanner(System.in);
        char target = 's';
        boolean sol =Search(arr,target);
        System.out.println(sol);

    }
    static boolean Search(String arr,int target){

        for (int l = 0; l<arr.length(); l++) {
            char i =arr.charAt(l);
            if (i == target) {
                return true;
            }
        }

        return false;
    }
}