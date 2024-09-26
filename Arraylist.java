import java.util.ArrayList;
import java.util.Collections;

public class Arraylist{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<Integer>();
        //ArrayList<String> list2 = new ArrayList<String>();
        //ArrayList<Boolean> list3 = new ArrayList<Boolean>();

        //add elements
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        System.out.println(list);

        //get an element
        int element = list.get(0);
        System.out.println(element);

        //add element in between
        list.add(1,2);
        System.out.println(list);

        //set element
        list.set(0,0);
        System.out.println(list);

        //delete elements
        list.remove(0);
        System.out.println(list);

        //size of list
        int size = list.size();
        System.out.println("size of list : " + size);

        //get all elements using loop
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        //Sorting the list
        Collections.sort(list);
        System.out.println("Sorted list : " + list);
    }
}
