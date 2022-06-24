package main;

import main.Matrix;

import java.util.Scanner;

public class MatrixCreator {
    public void fillRandomized(Matrix matrix, int minValue, int maxValue) {
        int h = matrix.getHorizontalSize();
        int v = matrix.getVerticalSize();

        for (int i = 0; i < v; i++) {
            for (int j = 0; j < h; j++) {
                int value = (int) ((Math.random() * (maxValue - minValue)) + minValue);
                try {
                    matrix.setElement(i, j, value);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public void fillManual(Matrix matrix) {
        int h = matrix.getHorizontalSize();
        int v = matrix.getVerticalSize();
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < v; i++) {
            for (int j = 0; j < h; j++) {
                int value = in.nextInt();

                try {
                    matrix.setElement(i, j, value);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }

            }
        }
    }

}
