package main;

public class Matrix {
   private int[][] arr;

   public Matrix(int[][] arr){
        this.arr = arr;
   }

   public Matrix(int m, int n) {
        if (n < 1 || m < 1)
            return;
        arr = new int[n][m];
   }

   public int getVerticalSize(){
       return arr.length;
   }
   public int getHorizontalSize(){
       return arr[0].length;
   }
   public int getElement(int i, int j){
       return arr[i][j];
   }
   public int[] getElement(int i){ return arr[i];}
   public int[][] getArr(){
           return arr;
    }

   public void setElement(int i, int j, int value) {
       arr[i][j] = value;
   }
   public void setElement(int i, int[] value){ arr[i] = value;}

    @Override
    public String toString() {
        final String blank = " ";
        StringBuilder s = new StringBuilder("\n");

        for(int[] row : arr ){
            for (int value : row){
                s.append(value).append(blank);
            }
            s.append("\n");
        }

        return s.toString();
    }
}
