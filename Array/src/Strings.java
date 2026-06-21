import java.util.Arrays;
import java.util.Scanner;


public class Strings {
    static void main() {
        Scanner input =new Scanner(System.in);

        String[] arr = new String[3];
        for (int i=0;i< arr.length;++i){
            arr[i]= input.next();

        }
        System.out.println(Arrays.toString(arr));
    }
}
