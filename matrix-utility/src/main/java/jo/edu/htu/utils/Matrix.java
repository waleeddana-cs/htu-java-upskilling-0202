package jo.edu.htu.utils;

public class Matrix {

    private int[][] matrix;

    public Matrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i] == null)
                throw new IllegalArgumentException("row " + i + " is null");
            if (matrix[i].length != matrix[0].length)
                throw new IllegalArgumentException("Inconsistent rows");
        }
        this.matrix = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++)
                this.matrix[i][j] = matrix[i][j];
        }
    }

    public int rows() {
        return matrix.length;
    }

    public int cols() {
        return matrix[0].length;
    }

    public int value(int row, int col) {
        if (row >= matrix.length || row < 0 || col >= matrix[0].length || col < 0)
            throw new IllegalArgumentException("invalid cell index: " + row + "," + col);
        return matrix[row][col];
    }

    public void forEach(ValueConsumer valueConsumer) {

    }

    public interface ValueConsumer {

        void accept(int row, int col, int value);
    }
}
