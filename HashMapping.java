import java.util.*;

public class HashMapping {
    public static void main(String args[]){
        //Creation
        HashMap<String, Integer> map = new HashMap<>();

        //Insertion
        map.put("India",120);
        map.put("US",30);
        map.put("China",150);

        System.out.println(map);

        map.put("China",180);   //updates the value of the existing key
        System.out.println(map);

        //Searching
        if(map.containsKey("China")){
            System.out.println("key is present");
        }
        else{
            System.out.println("key is not present");
        }

        //Getting value
        System.out.println(map.get("China"));
        System.out.println(map.get("Nepal"));       //null -> since the key doesnot exist

        //Iteration
        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        //Removing
        map.remove("China");
        System.out.println(map);
    }
}
