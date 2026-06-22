public class FindInArray {
    static void main(String[] args) {
        int[][] matrix ={{1,3,5,7},{10,11,16,20},{23,30,34,50}};
        int target =20;
        System.out.println(searchMatrix(matrix,target));

    }
    static boolean searchMatrix(int[][] matrix, int target) {
        boolean ans = false;
        int row=0;
        int col=matrix[row].length-1;
        int rmax=matrix.length-1;
        int cmin=0;
        while (row<matrix.length && col>=0){
            if (matrix[row][col]==target) {
                ans = true;
                break;
            }
            if (matrix[row][col]>target){
                col--;
                rmax=row;
            }else{
                row++;


            }
        }
        return ans;
    }
}
