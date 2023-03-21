import java.util.*;

public class IntersectionOfTwoArrays_Hashing {
    public static void intersection(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set1 = new HashSet<>();

        int count = 0;

        for(int i=0; i<arr1.length; i++) {
            set.add(arr1[i]);
        }

        for(int j=0; j<arr2.length; j++) {
            if(set.contains(arr2[j])) {
                
                count++;
                set1.add(arr2[j]);
               
                set.remove(arr2[j]);
            }
        }

        System.out.println("Elements in Intersection Set: " + set1);
        System.out.println("Size of Set: " + count);
        
    }
    public static void main(String[] args) {
        int[] arr1 = {7, 3, 9};
        int[] arr2 = {6, 3, 9, 2, 9, 4};

        intersection(arr1, arr2);
    }
}
