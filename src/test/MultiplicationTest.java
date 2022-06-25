package test;

import main.Matrix;
import main.Multiplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MultiplicationTest {
    @Test
    void testMultiplicationCase1(){
        var multiplication = new Multiplication();

        Matrix matrix1 = new Matrix(new int[][]{{1,1}, {1,1}});
        Matrix matrix2 = new Matrix(new int[][]{{1,1}, {1,1}});

        var actual = multiplication.multiply(matrix1, matrix2);
        var expected = new Matrix(new int[][]{{2,2},{2,2}});

        Assertions.assertEquals(expected.toString(),actual.toString());
    }
    @Test
    void testMultiplicationCase2(){
        var multiplication = new Multiplication();

        Matrix matrix1 = new Matrix(new int[][]{{1,2}, {2,3}});
        Matrix matrix2 = new Matrix(new int[][]{{3,4}, {4,5}});

        var actual = multiplication.multiply(matrix1, matrix2);
        var expected = new Matrix(new int[][]{{11,14}, {18,23}});

        Assertions.assertEquals(expected.toString(),actual.toString());
    }
    @Test
    void testMultiplicationCase3(){
        var multiplication = new Multiplication();

        Matrix matrix1 = new Matrix(new int[][]{{1,0,3}, {2,-3,1}, {2,3,5}});
        Matrix matrix2 = new Matrix(new int[][]{{3,4,4}, {4,5,-1},{3,-2,1}});

        var actual = multiplication.multiply(matrix1, matrix2);
        var expected = new Matrix(new int[][]{{12,-2,7},{-3,-9,12},{33,13,10}});

        Assertions.assertEquals(expected.toString(),actual.toString());
    }
    @Test
    void testMultiplicationCase4(){
        var multiplication = new Multiplication();

        Matrix matrix1 = new Matrix(new int[][]{{1,1,1}, {1,1,1}});
        Matrix matrix2 = new Matrix(new int[][]{{1,1}, {1,1}, {1,1}});

        var actual = multiplication.multiply(matrix1, matrix2);
        var expected = new Matrix(new int[][]{{2,2,2},{2,2,2},{2,2,2}});

        Assertions.assertEquals(expected.toString(),actual.toString());
    }
}