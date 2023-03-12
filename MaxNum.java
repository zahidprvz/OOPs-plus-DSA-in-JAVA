public class MaxNum {
    public static void main(String[] args) {
        //Array Declaration
        int[] arr = {1 , 2 , 143 , 34 , 4 , 0};

        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum number in array is: " + max);
    }
}
