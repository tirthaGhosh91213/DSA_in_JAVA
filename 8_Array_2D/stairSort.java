public class stairSort {
  public static int StairSort(int matrix[][],int key){
    int row=0;
    int col=matrix[0].length-1;
    while(row<matrix.length && col>=0){
      if(matrix[row][col]==key){
        return matrix[row][col]; 
      }
      else if(matrix[row][col]>key){
        col--; 
      }
      else{
        row++; 
      }
    }
    return -1;
  }
  public static void main(String[] args) {
    int matrix[][]={
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9}
    };
    int key=8;
    int result=StairSort(matrix,key);
    System.out.println("Stair Sort: " + result);

  }
}
