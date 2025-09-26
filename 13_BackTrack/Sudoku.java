public class Sudoku {
  public static  boolean isSafe(int sudoku[][], int row , int col, int digit){
    for (int i=0;i<=8;i++){
      if(sudoku[i][col]==0){
        return false;
      }
    }
    for (int j=0;j<=8;j++){
      if(sudoku[row][j]==0){
        return false;
      }
    }
    int sr=(row/3)*3;
    int sd=(col/3)*3;
    for(int i=sr;i<sr+3;i++){
      for(int j=sd;j<sd+3;j++){
        if(sudoku[i][j]==0){
          return false;
        }
      }
    }
    return true;
  }
  public static boolean sudokusolver(int sudoku[][] , int row, int col){
    if(row==9){
      return true;
    }
    int nextRow = row, nextCol=col+1;
    if(col+1==9){
      nextRow=row+1;
      nextCol=0;
    }
    if(sudoku[row][col] !=0){
      return sudokusolver(sudoku, nextRow, nextCol);
    }
    for(int digit =0;digit <=9;digit++){
      if(isSafe(sudoku,row,col,digit)){
        sudoku[row][col]=digit;
        if(sudokusolver(sudoku, nextRow, nextCol)){
          return true;
        }
        sudoku[row][col]=0;

      }
    }
return false;
  }
  public static void printSudoku(int sudoku[][]){
    for(int i=0;i<9;i++){
      for(int j=0;j<9;j++){
       System.out.println(sudoku[i][j]+" ");
      }
      System.out.println();
    }

  }
  public static void main(String[] args) {
    int sudoku[][]=
{
{0,0,8,0,0,0,4,7,5},
{4,9,0,1,5,7,0,0,2},
{0,0,3,0,0,4,1,9,0},
{0,0,3,0,0,4,1,9,0},
{1,8,5,0,6,0,0,2,0},
{0,0,0,0,2,0,0,6,0},
{9,6,0,4,0,5,3,0,0},
{0,3,0,0,7,2,0,0,4},
{0,4,9,0,3,0,0,5,7},
{8,2,7,0,0,9,0,1,3}};

if(sudokusolver(sudoku, 0, 0)){
    System.out.println("Solutin is exist ");
    printSudoku(sudoku);  
  }
  else{
    System.out.println("Solution dose not exist ");
  }
  }



}
