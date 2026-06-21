import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        int[] arr ={1,3,56,76,34,23,25};
        Scanner input = new Scanner(System.in);
        int target = input.nextInt();
        boolean sol =Search(arr,target);
        System.out.println(sol);

    }
    static boolean Search(int[] arr,int target){

        for (int l = 0; l<arr.length; l++) {
            int i =arr[l];
            if (i == target) {
                return true;
            }
        }

        return false;
    }
}