package test;

import main.Inversion;
import main.Matrix;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class InversionTest {
    @Test
    void testInversionCase1() {
        var inversion = new Inversion();
        Matrix matrix = new Matrix(new int[][]{{1, 2, 2}, {3, 3, 4}, {4, 7, 7}});

        var actual = inversion.inverse(matrix);
        var expected = new Matrix(new int[][]{{-7, 0, 2}, {-5, -1, 2}, {9, 1, -3}});

        Assertions.assertEquals(expected.toString(), actual.toString());
    }

    @Test
    void testInversionCaseImposible1() {
        var inversion = new Inversion();
        Matrix matrix = new Matrix(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});

        try {
            var actual = inversion.inverse(matrix);
            var expected = new Matrix(new int[][]{{-7, 0, 2}, {-5, -1, 2}, {9, 1, -3}});
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
    }
}