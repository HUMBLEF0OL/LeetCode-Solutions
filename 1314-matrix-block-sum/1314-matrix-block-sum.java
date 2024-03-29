class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
    int m = mat.length;
    int n = mat[0].length;
    int[][] answer = new int[m][n];

    // Compute the prefix sum matrix
    int[][] prefixSum = new int[m + 1][n + 1];
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            prefixSum[i + 1][j + 1] = mat[i][j] + prefixSum[i][j + 1] + prefixSum[i + 1][j] - prefixSum[i][j];
        }
    }

    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            int r1 = Math.max(0, i - k);
            int c1 = Math.max(0, j - k);
            int r2 = Math.min(m - 1, i + k);
            int c2 = Math.min(n - 1, j + k);

            answer[i][j] = prefixSum[r2 + 1][c2 + 1] - prefixSum[r2 + 1][c1] - prefixSum[r1][c2 + 1] + prefixSum[r1][c1];
        }
    }

    return answer;
}

}