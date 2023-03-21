import java.util.*;

public class UnionOfTwoArrays_HashSet {
    public static void union(int[] arr1, int[] arr2) {   //O(n)
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<arr1.length; i++) {
            set.add(arr1[i]);
        }

        for(int j=0; j<arr2.length; j++) {
            set.add(arr2[j]);
        }

        System.out.println("Elements in Union Set: " + set);
        

        System.out.println("Total size of Union Set is: " + set.size());
    }
    public static void main(String[] args) {
        int[] arr1 = {7, 3, 9};
        int[] arr2 = {6, 3, 9, 2, 9, 4};

        union(arr1, arr2);
    }
}
