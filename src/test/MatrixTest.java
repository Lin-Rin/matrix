package test;

import main.Matrix;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MatrixTest {
    @Test
    void testRegularCase(){
        var arr = new int[][] {{1},{3,2}};

        var excepted = new Matrix(arr);
        var actual = new int[][] {{1},{3,2}};
        Assertions.assertEquals(actual[1][0], excepted.getElement(1,0));
    }
    @Test
    public void testNullPointerException() {
        Matrix matrix = new Matrix(-1,2);
        try {
            matrix.getElement(1,1);
        } catch (NullPointerException ex) {
            assertTrue(true);
        }
    }
    @Test
    void testVerticalSize(){
        var excepted = 4;
        var actual = new Matrix(3,4);
        Assertions.assertEquals(actual.getVerticalSize(),excepted);
    }

    @Test
    void testHorizontalSize(){
        var excepted = 12;
        var actual = new Matrix(3,12);
        Assertions.assertEquals(actual.getVerticalSize(),excepted);
    }

}