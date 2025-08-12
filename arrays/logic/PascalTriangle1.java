package arrays.logic;

public class PascalTriangle1 {
    public static void main(String[] args) {
        System.out.println(pascalTriangleIV2(5,3));
    }
    public int pascalTriangleI(int r, int c) {
        if (r == c || c==1) return 1;
        if (c > r) return 0;
        return pascalTriangleI(r - 1, c) + pascalTriangleI(r - 1, c - 1);
    }

    public static int pascalTriangleIV2(int r, int c) {
        int [][] matrix = new int[r][r];
        for(int i = 0; i < matrix.length; i ++) {
            for(int j = 0; j < i+1; j++) {
                if(i==j || j==0) matrix[i][j] = 1;
                else {
                    matrix[i][j] = matrix[i-1][j-1]+matrix[i-1][j];
                }
            }
        }
        return matrix[r-1][c-1];
    }
}
