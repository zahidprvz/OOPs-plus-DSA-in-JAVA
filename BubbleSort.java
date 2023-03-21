public class BubbleSort {

    //Method to print Array
    public static void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //Main Method
    public static void main(String[] args) {
        int[] arr = {7,8, 3, 2, 1};

        //Bubble Sort
        for(int i=0; i<arr.length-1; i++) {       //Last will automatically be arranged that's why n-1
            for(int j=0; j<arr.length-i-1; j++) {   //arr.length-i-1 discards sorted element
                //Sorting Condition
                if(arr[j] < arr[j+1]) {
                    //Swap
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];      //Sort in Descedning Order
                    arr[j] = temp;
                }
            }
        }
        //Calling the method to printArray
        printArray(arr);
    }
}