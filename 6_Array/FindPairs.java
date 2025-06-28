
public class FindPairs {
    public static void findPairs(int arr[]){
        int tp=0;
        for(int i=0 ; i<arr.length ; i++){
            int curr=arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+curr+","+arr[j]+")");
                tp++;
            }

            System.out.println();
        }
         System.out.println("The number of pairs => "+tp);
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 7, 6, 3, 5, 9, 2};
        

        findPairs(arr);
    }

    
}
