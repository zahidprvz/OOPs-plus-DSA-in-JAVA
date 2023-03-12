import java.util.Scanner;

class Library {
    Scanner sc = new Scanner(System.in);

/*
    String[] list = {
        "1: The Alchemist" ,
        "2: Think & Grow Rich" ,
        "3: Al-Quran" , 
        "4: Atomic Habits" ,
        "5: Forty Rules of Love" , 
        "6: Java OOPS" , 
        "7: The Great Gatsby" , 
        "8: Pride & Prejudice" , 
        "9: Java Eyre" , 
        "10: Invisible Man" , 
        "11: The Rumi" , 
        "12: The Big Red Book" , 
        "13: The Ikigai" ,
        "14: Allama Iqbal" , 
        "15: The Pakistan" , 
        "16: Data Structures" , 
        "17: Diwaan e Ghalib" , 
        "18: Shayad" , 
        "19: Goya" , 
        "20: Yaani" , 
        "21: Gumaan" , 
        "22: Farnood" , 
        "23: 7 Habits of Highly Effective People" , 
        "24: How to become a Man" , 
        "25:Great Expectations" , 
        "26: War & Peace" , 
        "27: Invisible Man" 
       };
*/
    String[] books;
    int no_of_books;

    Library() {
        this.books = new String[50];
        this.no_of_books = 0;
    }
   
    public void addBook(String b) {
        books[no_of_books] = b;
        no_of_books++;
    }

    public void issueBook() {

    }

    public void returnBook() {

    }

    public void showAvailableBooks() {
        for(int i=0; i<books.length; i++) {
            if(books[i] != null) {
                System.out.println(books[i]);
            } else {
                break;   
            }
        }
    }

    public void start() {
        
        System.out.println("\n-----Welcome to the Library-----\n");

        System.out.println("How can we Help YOU? \nPlease select from the following options:");
        System.out.println("Press 1 to 'Show' all the available books in the library");
        //System.out.println("Press  if you want to 'Add' a new book in the library");
        System.out.println("Press 2 if you want to 'Issue' a book from the library");
        System.out.println("Press 3 if you want to 'Return' a book to the library");
    }

}

public class OnlineJavaLibrary {
    public static void main(String[] args) {
        // Have to implement a library using Java Class library
        // Methods: 1=addBook , 2=issueBook , 3=returnBook , 4=showAvailableBooks,
        // Properties: Array to store available books,
        // Array to store issued books..!

        Scanner sc = new Scanner(System.in);
        Library lib = new Library();

        lib.addBook("Alchemist");
        lib.addBook("Think And Grow Rich");
        lib.addBook("Al-Quran");
        lib.addBook("Titanic");
        lib.addBook("The Rumi");
        lib.addBook("Atomic Habits");
        lib.addBook("Shayad");
        lib.addBook("Yani");
        lib.addBook("Goya");
        lib.addBook("Gumaan");
        lib.addBook("Farnood");


        lib.start();

        
        int choice = sc.nextInt();

        System.out.println("");

        if(choice == 1) {
            lib.showAvailableBooks();
        }
        else if(choice == 2) {
            System.out.println("2 mint");
        }
        sc.close();
    }
}
