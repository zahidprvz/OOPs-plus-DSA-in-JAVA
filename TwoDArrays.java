import java.util.*;

public class TwoDArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter size of columns: ");
        int columns = sc.nextInt();
        
        int[][] numbers = new int[rows][columns];

        for(int i=0; i<rows; i++) {
            for(int j=0; j<columns; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter number to search in matrix");
        int x = sc.nextInt();

        for(int i=0; i<rows; i++) {
            for(int j=0; j<columns; j++) {
                if(numbers[i][j] == x) {
                    System.out.print("X found at " + i + "th row and " + j + "th column");
                }
            }
        }
        sc.close();
    }
}
