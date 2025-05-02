public class Main {
    public static void main(String args[]){
        int[][] arr =  {{2, 1, 0},{1, 3, 2},{0, 0, 0},{4, 5, 6}};
        System.out.println(ArrayResizer.isNonZeroRow(arr, 0));
        System.out.println(ArrayResizer.isNonZeroRow(arr, 1));
        System.out.println(ArrayResizer.isNonZeroRow(arr, 2));
        System.out.println(ArrayResizer.isNonZeroRow(arr, 3));
        int[][] newsmt = (ArrayResizer.resize(arr));
        
        for(int i = 0; i< newsmt.length; i++){
          for(int n =0; n< newsmt[0].length; n++){
            System.out.print(newsmt[i][n]);
          }
          System.out.println();
        }
    }
}
