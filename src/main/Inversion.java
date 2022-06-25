package main;

public class Inversion {

    public Matrix inverse(Matrix matrix) throws IllegalArgumentException {
        int[][] inverse = new int[matrix.getHorizontalSize()][matrix.getVerticalSize()];

        for (int i = 0; i < matrix.getVerticalSize(); i++)
            for (int j = 0; j < matrix.getElement(i).length; j++)
                inverse[i][j] = (int) (Math.pow(-1, i + j)
                        * determinant(minor(matrix, i, j)));

        if (determinant(matrix) == 0)
            throw new IllegalArgumentException("+-inf");

        double det = 1.0 / determinant(matrix);

        for (int i = 0; i < inverse.length; i++) {
            for (int j = 0; j <= i; j++) {
                double temp = inverse[i][j];
                inverse[i][j] = (int) (inverse[j][i] * det);
                inverse[j][i] = (int) (temp * det);
            }
        }

        return new Matrix(inverse);
    }

    private double determinant(Matrix matrix) {
        if (matrix.getHorizontalSize() != matrix.getVerticalSize())
            throw new IllegalStateException("invalid size");

        if (matrix.getHorizontalSize() == 2)
            return matrix.getElement(0, 0) * matrix.getElement(1, 1)
                    - matrix.getElement(0, 1) * matrix.getElement(1, 0);

        double det = 0;
        for (int i = 0; i < matrix.getElement(0).length; i++)
            det += Math.pow(-1, i) * matrix.getArr()[0][i]
                    * determinant(minor(matrix, 0, i));
        return det;
    }

    private Matrix minor(Matrix matrix, int row, int column) {
        int[][] minor = new int[matrix.getVerticalSize() - 1][matrix.getHorizontalSize() - 1];

        for (int i = 0; i < matrix.getHorizontalSize(); i++)
            for (int j = 0; i != row && j < matrix.getElement(i).length; j++)
                if (j != column)
                    minor[i < row ? i : i - 1][j < column ? j : j - 1] = matrix.getArr()[i][j];

        return new Matrix(minor);
    }

}