import java.util.HashSet;
import java.util.Iterator;

public class Hashing_HashSet {
    public static void main(String[] args) {
        //Creation
        HashSet<Integer> set = new HashSet<>();

        //Inserting in HashSet
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1); 

        //Size of Set
        System.out.println("Size of set is: " + set.size());

        //Iterator in set to iterate set like (i,j) in for loops
        Iterator it = set.iterator();
        //it has two special functions i.e, hasNext and next

        while(it.hasNext()) {
            System.out.println(it.next());
        }

        //Printing all elements in Set
        System.out.println(set);

        //Searching in HashSet
        if(set.contains(1)) {
            System.out.println("Set contains 1");
        }
        if(!set.contains(6)) {
            System.out.println("Does not contain");
        }

        //Deletion in HashSet
        set.remove(1);
        if(!set.contains(1)) {
            System.out.println("1 is deleted.");
        }

        //Size of Set
        System.out.println("Size of set is: " + set.size());
    }    
}
