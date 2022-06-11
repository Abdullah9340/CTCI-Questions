public class zeroMatrix {
    public static void makeMatrixZero(int[][] arr) {
        // Assume it is an NxN Matrix
        boolean[] rows = new boolean[arr.length], columns = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 0) {
                    rows[i] = true;
                    columns[j] = true;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (rows[i] || columns[j]) {
                    arr[i][j] = 0;
                }
            }
        }
    }
}
