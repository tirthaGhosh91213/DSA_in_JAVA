
public class binarySearch {

    public static int binary(int number[], int target) {
        int l = 0;
        int h = number.length;
        
        while(l<=h){
        int mid = ((l + h) / 2);
            if (number[mid] == target) {
                return mid;

            } else if (number[mid] < target) {
                l = mid+1;
            } else {
                h = mid-1;
            }
        }
        return  -1;
  }

    public static void main(String[] args) {
        int number[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 50, 54, 60};

        int target = 9;
        System.out.println("The number is present in the array at the index:" + binary(number, target));
    }
}
