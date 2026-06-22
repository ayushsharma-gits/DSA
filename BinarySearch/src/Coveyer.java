public class Coveyer {
    static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9,10};
        int days =5;
        System.out.println(shipWithinDays(arr,days));

    }static int shipWithinDays(int[] weights, int days) {

        int s = max(weights);
        int e = sum(weights);

        while (s < e) {

            int mid = s + (e - s) / 2;

            if (Allday(weights, mid) > days) {
                s = mid + 1;
            } else {
                e = mid;
            }
        }

        return s;
    }

    static int Allday(int[] weights, int capacity) {

        int days = 1;
        int load = 0;

        for (int weight : weights) {
            if (load + weight > capacity) {
                days++;
                load = weight;
            } else {
                load += weight;
            }
        }

        return days;
    }

    static int sum(int[] weights) {
        int sum = 0;
        for (int weight : weights)
            sum += weight;
        return sum;
    }

    static int max(int[] weights) {
        int max = weights[0];
        for (int weight : weights)
            if (weight > max)
                max = weight;
        return max;
    }
}
