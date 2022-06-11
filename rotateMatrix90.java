public class rotateMatrix90 {

    /*
     * INCOMPLETE
     * Concept:
     * Rotate layer by layer
     * 
     * 0 0 -> 0 n - 1
     * 0 1 -> 1 n - 2
     * 0 2 -> 2 n - 3
     * 
     * IN GENERAL
     * i j -> j n - j - 1
     * 
     * top position
     * 
     * Make a 14x14 matrix
     *
     * 
     * 7 4 1
     * 8 5 2
     * 9 6 3
     */

    // Make a 7x7 example matrix in commnets for visual purposes

    // 15 16 17 18 19
    // 22 23 24 25 26
    // 29 30 31 32 33
    // 36 37 38 39 40
    // 43 44 45 46 47

    public static void rotateMatrix(int[][] matrix) {
        if (matrix.length == 0 || matrix.length != matrix[0].length) {
            return;
        }
        // Have matrix.length / 2 layers
        int layers = matrix.length / 2;

        for (int i = 0; i < layers; i++) {
            int start = i;
            int end = matrix.length - i - 1;
            for (int j = start; j < end; j++) {
                int offset = j - start;
                // This holds the top value
                int temp = matrix[start][j];
                // Copy left into top
                matrix[start][j] = matrix[end - offset][start];
                // Copy bottom into left
                matrix[end - offset][start] = matrix[end][end - offset];

                // Right to bottom
                matrix[end][end - offset] = matrix[i][end];

                matrix[i][end] = temp;

            }
        }

    }
}
