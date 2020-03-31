package jo.edu.htu.utils;



public class Matrix {

    private int[][] matrix;

    public Matrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            if (matrix[row] == null)
                throw new IllegalArgumentException("row " + row + " is null");
            if (matrix[row].length != matrix[0].length)
                throw new IllegalArgumentException("Inconsistent rows");
        }
        this.matrix = matrix;


    }

    public int rows() {

        return matrix.length;

    }

    public int cols() {
        return matrix[0].length;

    }


    public int value(int row, int col) {
        if (row>matrix.length)
            throw new IllegalArgumentException("invalid cell index: " + row + "," + col);
        return matrix[row][col];
    }


    public void forEach(ValueConsumer valueConsumer) {
        for (int row=0;row<matrix.length;row++)
            for (int col = 0; col <matrix[row].length ; col++) {
                valueConsumer.accept(row,col,value(row,col));
            }}

    public interface ValueConsumer {

        void accept(int row, int col, int value);
    }
}
