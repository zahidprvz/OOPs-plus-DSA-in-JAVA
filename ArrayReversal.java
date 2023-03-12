
public class ArrayReversal {
    public static void main(String[] args) {
        int[] arr = {1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9};
        int l = arr.length;
        int count = Math.floorDiv(l, 2);

        int temp = 0;
        for(int i=0; i<count; i++) {
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }

        for(int element : arr) {
            System.out.print(element + " ");
        }
    }    
}
