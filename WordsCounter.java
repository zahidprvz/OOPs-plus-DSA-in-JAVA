import java.util.Scanner;

public class WordsCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a line to count words within: ");
        String line = sc.nextLine();

        System.out.print("Number of words in your input: " +wordcounter(line));
        sc.close();
    }
    static int wordcounter(String line) {
        int count = 0;
        for(int i=0; i<line.length(); i++) {
            if(line.charAt(i) == ' ') {
                count++;
            }
        }
        count = count + 1;
        return count;
    }    
    
}
