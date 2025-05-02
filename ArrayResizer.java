public class ArrayResizer
{
  private static int[][] array;
  
  public ArrayResizer(int[][] a){
    array = a;
  }
  public static boolean isNonZeroRow(int[][] array2D, int r)
  { 
    boolean smt = true;
    for(int i = 0; i < array2D[r].length; i++){
      if(array2D[r][i] == 0) smt = false;
    }
    return smt;
  }

  public static int numNonZeroRows(int[][] array2D)
  { 
    int count = 0;
    for (int i = 0; i < array2D.length; i++) {
      if (isNonZeroRow(array2D, i)) count++;
    }
    return count;
  }

  public static int[][] resize(int[][] array2D)
  {
    int[][] newArray = new int[numNonZeroRows(array2D)][array2D[0].length];
    int rowIndex =0; 
    for(int i =0; i < array2D.length; i++){
      if(isNonZeroRow(array2D, i)){
        newArray[rowIndex] = array2D[i];
        rowIndex++;
      }
    }  
    return newArray;
  }
}
