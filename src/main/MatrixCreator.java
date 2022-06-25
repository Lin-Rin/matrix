package main;

import java.util.Scanner;

public class MatrixCreator {
    public void fillRandomized(Matrix matrix, int minValue, int maxValue) {
        int horizontal = matrix.getHorizontalSize();
        int vertical = matrix.getVerticalSize();

        for (int i = 0; i < vertical; i++) {
            for (int j = 0; j < horizontal; j++) {

                int value = (int) (Math.random() * (maxValue - minValue+1) + minValue);
                matrix.setElement(i, j, value);
            }
        }
    }

    public void fillManual(Matrix matrix) {
        int horizontal = matrix.getHorizontalSize();
        int vertical = matrix.getVerticalSize();
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < vertical; i++) {
            for (int j = 0; j < horizontal; j++) {
                int value = in.nextInt();
                matrix.setElement(i, j, value);

            }
        }
    }
}
