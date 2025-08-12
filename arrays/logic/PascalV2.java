package arrays.logic;

import java.util.Arrays;

public class PascalV2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(pascalTriangleII(4)));
    }
    public  static int[] pascalTriangleII(int r) {
        int [][] mat = new int[r][r];
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < i+1; j ++) {
                if(j==0 || j==i) mat[i][j] = 1;
                else {
                    mat[i][j] = mat[i-1][j] + mat[i-1][j-1];
                }
            }
        }
        return mat[r-1];
    }
}
