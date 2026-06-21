public class TwoDBinary {
    static void main(String[] args) {
        int[][] arr = {{4,3,2,-1}
                , {3,2,1,-1},
                {1,1,-1,-2},{-1,-1,-2,-3}};
        int target = 27;
        System.out.println(arr[0][2]);
        System.out.println(countNegatives(arr));
    }

    static int countNegatives(int[][] grid) {

        int ce = grid.length - 1;
        int re = 0;
        int rmax = grid[ce].length;
        int cmax = grid.length;
        int count = 0;
        while (re < grid[ce].length && ce >=0) {
            if (grid[3][0] < 0&& re==3 && ce==0) {
                re++;
                count = count + rmax;
                cmax--;
            }

            else if (grid[re][ce] < 0) {
                ce--;
                count = count + rmax;
                cmax--;
            }
            else if (grid[re][0] > 0) {
                re++;
                rmax--;
            }
              else {
                re++;
                rmax--;
            }


        }
        return count;

    }
}

