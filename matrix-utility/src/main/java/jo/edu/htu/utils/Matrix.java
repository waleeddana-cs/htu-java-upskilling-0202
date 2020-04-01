package jo.edu.htu.utils;

public class Matrix {
    int[][] mat;

    public Matrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            if (matrix[row] == null)
                throw new IllegalArgumentException("row " + row + " is null");
            if (matrix[row].length != matrix[0].length)
                throw new IllegalArgumentException("Inconsistent rows");
        }
        mat = matrix;
    }

    public int rows() {
        return mat.length;
    }

    public int cols() {
        return mat[0].length;
    }

    public int value(int row, int col) {
        return mat[row][col];
    }

    public void forEach(ValueConsumer valueConsumer) {
        for (int[] i : mat) {
            for (int j : i) {
                System.out.println(j + " ");
            }
            System.out.println();
        }
    }


    public interface ValueConsumer {

        void accept(int row, int col, int value);
    }
}
