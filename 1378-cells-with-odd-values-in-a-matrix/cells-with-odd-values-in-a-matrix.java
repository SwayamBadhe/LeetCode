class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];
        for (int i=0; i!=indices.length; i++) {
            int rowVal = indices[i][0];
            int colVal = indices[i][1];
            for (int j=0; j!=n; j++) {
                matrix[rowVal][j]++;
            }
            for (int j=0; j!=m; j++) {
                matrix[j][colVal]++;
            }
        }
        int oddD = 0;
        for (int[] row: matrix) {
            for (int val: row) {
                if (val % 2 == 1) oddD++; 
            }
        }
        return oddD;
    }
}