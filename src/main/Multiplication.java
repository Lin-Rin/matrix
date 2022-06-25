package main;

public class Multiplication {
    public Matrix multiply(Matrix matrix1, Matrix matrix2) {
        int vertical = matrix1.getVerticalSize();
        int horizontal = matrix2.getHorizontalSize();
        int controlSize = matrix1.getHorizontalSize();

        Matrix result = new Matrix(vertical, horizontal);

        for (int i = 0; i < vertical; i++) {
            for (int j = 0; j < horizontal; j++) {
                int value = 0;
                for (int k = 0; k < controlSize; k++) {
                    value += matrix1.getElement(i, k) * matrix2.getElement(k, j);
                }
                result.setElement(i, j, value);
            }
        }

        return result;
    }

}