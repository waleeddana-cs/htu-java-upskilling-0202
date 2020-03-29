package jo.edu.htu.utils;


public class Matrix {
    int[][] matrix;

    public Matrix(int[][] matrix) {
        this.matrix = new int[matrix.length][];
        for (int row = 0; row < matrix.length; row++) {
            if (matrix[row] == null)
                throw new IllegalArgumentException("row " + row + " is null");
            if (matrix[row].length != matrix[0].length)
                throw new IllegalArgumentException("Inconsistent rows");

            this.matrix[row] = matrix[row].clone();
        }
    }

    public int rows() {
        return matrix.length;
    }

    public int cols() {
        return matrix[0].length;
    }

    public int value(int row, int col) {
        if (row > matrix.length - 1 || row < 0)
            throw new IllegalArgumentException("invalid cell index: " + row + "," + col);
        if (col > matrix[0].length - 1 || col < 0)
            throw new IllegalArgumentException("invalid cell index: " + row + "," + col);

        return matrix[row][col];
    }

    public void forEach(ValueConsumer valueConsumer) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                valueConsumer.accept(row, col, matrix[row][col]);
            }
        }
    }

    public interface ValueConsumer {

        void accept(int row, int col, int value);
    }
}
