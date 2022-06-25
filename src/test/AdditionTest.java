package test;

import main.Addition;
import main.Matrix;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AdditionTest {
    @Test
    void testAdditionCase1(){
        var addition = new Addition();
        Matrix matrix = new Matrix(new int[][]{{1,1}, {1,1}});

        var actual = addition.addition(matrix, matrix);
        var expected = new Matrix(new int[][]{{2,2},{2,2}});

        Assertions.assertEquals(expected.toString(), actual.toString());
    }
    @Test
    void testAdditionCase2(){
        var addition = new Addition();

        Matrix matrix1 = new Matrix(new int[][]{{0,2}, {1,2}});
        Matrix matrix2 = new Matrix(new int[][]{{-2,1}, {3,-1}});

        var actual = addition.addition(matrix1, matrix2);
        var expected = new Matrix(new int[][]{{-2,3},{4,1}});

        Assertions.assertEquals(expected.toString(),actual.toString());
    }
    @Test
    void testAdditionCase3(){
        var addition = new Addition();

        Matrix matrix1 = new Matrix(new int[][]{{0,-2,1}, {1,2,3}});
        Matrix matrix2 = new Matrix(new int[][]{{-2,1}, {5-4,-1}});

        var actual = addition.addition(matrix1, matrix2);
        var expected = new Matrix(new int[][]{{-2,-1},{2,1}});

        Assertions.assertEquals(expected.toString(),actual.toString());
    }
}