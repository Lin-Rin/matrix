package main;

public class Addition {
    public Matrix addition(Matrix matrix1, Matrix matrix2){
        int vertical = matrix1.getVerticalSize();
        int horizontal = matrix2.getHorizontalSize();

        Matrix result = new Matrix(vertical, horizontal);

        for (int i = 0; i < vertical; i++) {
            for (int j = 0; j < horizontal; j++) {
                int value = matrix1.getElement(i, j) + matrix2.getElement(i, j);

                result.setElement(i, j, value);
            }
        }

        return result;
    }
}
