public class diagonalSum {
  public static int DiagonalSum(int matrix[][]){
    int sum=0;
    int n = matrix.length; 
    for(int i=0;i<matrix.length;i++){
      sum += matrix[i][i]; 
      if(i!=n-1-i){
        sum+=matrix[i][n-1-i];
      }
    }
    return sum;

  }
  public static void main(String[] args) {
    int matrix[][] = {
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9}
    };
    int result = DiagonalSum(matrix);
    System.out.println("Diagonal Sum: " + result);
  }
}
