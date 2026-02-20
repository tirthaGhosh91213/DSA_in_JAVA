
public class ioOfArr {

   
    public static boolean search(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {          
            for (int j = 0; j < matrix[0].length; j++) {   
                if (matrix[i][j] == target) {
                    System.out.printf("Element %d found at index (%d,%d)%n", target, i, j);
                    return true;       
                }
            }
        }
        System.out.println("Element not found 🥹");
        return false;                  
    }

    public static void largest(int matrix[][]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]>max){
                    max=matrix[i][j];
                   
                }
            }

        }
         System.out.println(max);
    }
    public static void spiralMatrix(int matrix[][]){
        int startRow=0;
        int endRow=matrix.length-1;
        int startCall=0;
        int endCall=matrix[0].length-1;
        while(startCall<=endCall && startRow<=endRow){

        
        for(int i=startCall;i<=endCall;i++){
            System.out.print(matrix[startRow][i]+" ");
        }
        for(int j=startRow+1;j<=endRow;j++){
            System.out.print(matrix[j][endCall]+" ");
        }
        for(int i=endCall-1;i>=startCall;i--){
            if(startRow==endRow){
                break;
            }
            System.out.print(matrix[endRow][i]+" ");
        }
        for(int j=endRow-1;j>=startRow;j--){
            if(startCall==endCall){
                break;
            }
            System.out.print(matrix[j][startCall]+" ");
        }
        startRow++;
        endRow--;
        startCall++;
        endCall--;
    }
    }

    public static void sumDiagonal(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i]==matrix[j]){
                    sum+=matrix[i][j];
                    
                }
                else if(i+j==matrix.length-1){
                    sum+=matrix[i][j];                }
            }
        }
        System.out.println(sum);
    }
    public static void sumDiagonal2(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            sum+=matrix[i][i];
            int j=matrix.length-1-i;
            if(i!=j)
            sum+=matrix[i][j];
       
        }
         System.out.println(sum);
    }
    public static void main(String[] args) {

        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
         sumDiagonal2(arr);

    /*
        int[][] matrix = new int[3][3];
        int n = matrix.length, m = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 × 3 matrix elements:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMatrix you entered:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
 */
        // boolean found = search(matrix, 8);     
        // System.out.println("Search result : " + found);
       
    }
}
