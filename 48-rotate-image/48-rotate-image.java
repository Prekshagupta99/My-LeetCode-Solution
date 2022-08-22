class Solution {
    public void rotate(int[][] matrix) {
        int len = matrix.length;
        int p;
        for (int i = 0; i < len; i++) { 
            for (int j = i; j < len; j++) {
                p = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = p;
            }
        }
        for (int i = 0; i < len/2; i++) {
            for (int j = 0; j < len; j++) {
                p = matrix[j][i];
                matrix[j][i] = matrix[j][len - 1 - i];
                matrix[j][len - 1 - i] = p;
            }
        }
    }
}