public class SortedOrNot {
    public static void main(String[] args) {
        //Array Declaration
        int[] arr = {1 , 2 , 12 , 3 , 4};

        boolean isSorted = true;
        for(int i=0; i<arr.length-1; i++) {
            if(arr[i] > arr[i+1]) {
            isSorted = false;
            break;
            }
        }
        if(isSorted) {
            System.out.println("Array is Sorted!");
        } else {
            System.out.println("Array is not Sorted!");
        }
    }
}
