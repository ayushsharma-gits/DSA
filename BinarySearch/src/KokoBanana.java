public class KokoBanana {
    static void main(String[] args) {
        int[] piles={30,11,23,4,20};
        int h=6;
        System.out.println(minEatingSpeed(piles,h));

    }static int minEatingSpeed(int[] piles, int h) {
        int max=0;
        int perhours=0;
        while(max !=h){
            perhours++;
            max =Allsum(piles,perhours);

        }
        return perhours;
    }static int Allsum(int[] piles,int perhours) {
        int hours = 0;
        for (int i = 0; i < piles.length; i++) {
            hours += piles[i] / perhours;
            if (piles[i] % perhours > 0) hours++;
        }
        return hours;
    }
}
