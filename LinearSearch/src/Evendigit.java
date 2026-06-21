public class Evendigit {
    static void main(String[] args) {
        int[] num = {1, 23, 34, 56, 1, 342, 345};
        System.out.println(Even(num));


    }

    static int Even(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;

            }

        }
        return count;


    }

    static boolean even(int num) {
        int NoOfDigits = digits(num);
        if (NoOfDigits % 2 == 0) {
            return true;
        }
        return false;

    }

    static int digits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}