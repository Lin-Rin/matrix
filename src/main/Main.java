package main;

public class Main {
    public static void main(String[] args) {
        System.out.println("property-based test goes brr...");
        int[][] arr1 = new int[][]{{1,2},{3,4}};
        int[][] arr2 = new int[][]{{5,6},{7,8}};

        Addition addition = new Addition();
        var res = addition.addition(new Matrix(arr1),new Matrix(arr2));
        // etc
    }
}