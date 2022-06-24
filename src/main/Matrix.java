package main;

public class Matrix {
   private int[][] arr;

   public Matrix(int[][] arr){
        this.arr = arr;
   }

   public Matrix(int m, int n) throws Exception {
        if (n < 1 || m < 1)
            throw new Exception();

        arr = new int[n][m];
   }
   public int getVerticalSize(){
       return arr.length;
   }
   public int getHorizontalSize(){
       return arr[0].length;
   }
   public int getElement(int i, int j){
       return 0;
   }

   public void setElement(int i, int j, int value) throws Exception {
       if (check(i,j))
           arr[i][j] = value;
       else
           throw new Exception();
   }

    @Override
    public String toString() {
        final String BLANK = "";
        StringBuilder s = new StringBuilder("\nmain.Matrix: " + arr.length + "x" + arr[0].length + "\n");

        for(int[] row : arr ){
            for (int value : row){
                s.append(value).append(BLANK);
            }
            s.append("\n");
        }

        return s.toString();
    }

    private boolean check(int i, int j){
       if (i < 0 || i > arr.length - 1 || j < 0 || j > arr[0].length - 1)
           return true;
       else
           return false;
    }
}
