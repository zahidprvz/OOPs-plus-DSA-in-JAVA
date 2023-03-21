import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();

        int[] marks = new int[size];
        
        for(int i=0; i<size; i++) {
            marks[i] = sc.nextInt();
        }

        System.out.println("Enter the number you want to search from array: ");
        int x = sc.nextInt();

        for(int i=0; i<size; i++) {
            if(marks[i] == x) {
                System.out.println("Number found at " + i + " index");
                break;
            }
        }
        sc.close();       
    }
}