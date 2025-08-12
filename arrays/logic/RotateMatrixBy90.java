package arrays.logic;

import java.util.Arrays;

public class RotateMatrixBy90 {
    public static void main(String[] args) {
        int [][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotateMatrix(arr);
    }
    public static void rotateMatrix(int[][] matrix) {
        for(int i = 0; i < matrix.length; i ++) {
            for(int j = i; j < matrix[0].length; j ++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int [] arr : matrix) {
            int i = 0, j = arr.length -1;
            while(i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
