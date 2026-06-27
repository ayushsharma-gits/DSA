import java.util.Arrays;

public class Main {
    static void main(String[] args) {
        int[] arr={2,4,5,3,1};
        //sorting the arr and returning it
        cycle(arr);
        System.out.println(Arrays.toString(arr));
        
    }static void cycle(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] !=i+1){
                int temp =arr[arr[i]-1];
                arr[arr[i]-1]=arr[i];
                arr[i]=temp;
                i--;
            }
        }
    }






    static void insertion(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0; j--) {
                if (arr[j]<arr[j-1]){
                    //swap
                    int temp =arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }else {
                    break;
                }

            }
        }
    }



    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int e= arr.length-1-i;
            int max=Max(arr,0,e);
            int temp =arr[max];
            arr[max]=arr[e];
            arr[e]=temp;

        }
    }static int Max(int[] arr,int s,int e){
        int max=s;
        for (int i = 0; i <= e; i++) {
            if (arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }




    static void sort(int[] arr){
        boolean swapped;
        for (int i = 0; i <arr.length; i++) {
            swapped=false;
            for (int j = 1; j <arr.length-i ; j++) {
                if (arr[j] <arr[j-1]) {
                    //swap
                    int temp =arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
                
            }
            //if no swap in first loop then array is already sorted
            if(swapped==false){
                break;
            }
        }
    }

}
