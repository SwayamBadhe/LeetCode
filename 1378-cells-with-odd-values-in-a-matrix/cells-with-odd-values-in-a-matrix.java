class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        // int[][] matrix = new int[m][n];
        // for (int i=0; i!=indices.length; i++) {
        //     int rowVal = indices[i][0];
        //     int colVal = indices[i][1];
        //     for (int j=0; j!=n; j++) {
        //         matrix[rowVal][j]++;
        //     }
        //     for (int j=0; j!=m; j++) {
        //         matrix[j][colVal]++;
        //     }
        // }
        // int oddD = 0;
        // for (int[] row: matrix) {
        //     for (int val: row) {
        //         if (val % 2 == 1) oddD++; 
        //     }
        // }
        // return oddD;

        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];
        for (int i=0; i!=indices.length; i++) {
            row[indices[i][0]] ^= true;
            col[indices[i][1]] ^= true;
        }

        int r = 0, c = 0;
        for (int i=0; i!=m; i++) {
            if (row[i]) r++;
        }
        for (int i=0; i!=n; i++) {
            if (col[i]) c++;
        }

        return r*n + c*m - 2*r*c;


    }
}