import java.util.HashSet;
import java.util.Iterator;

public class Hashing{
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        //Add
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        set.add(5);

        //Print all elements
        System.out.println(set);

        //Size
        System.out.println("size : " + set.size());

        //Search
        if(set.contains(1)){
            System.out.println("1 present");
        }
        if(!set.contains(6)){
            System.out.println("6 not present");
        }

        //Delete
        set.remove(1);
        System.out.println(set);

        //Iteration - HashSet doesnot have an order
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println();

        //isEmpty
        if(set.isEmpty()){
            System.out.println("Set is empty");
        }
        else{
            System.out.println("Set is not empty");
        }

    }
}