public class string{
    public static void main(String args[]){
        //String name = "Ravi";
        //obviously this will work but this is not a good approach
        //Good approach:
        String name = new String("Ravi");       //now it can also be worked as object
        System.out.println("Hello " + name);

        System.out.println(name.charAt(1));
        System.out.println(name.charAt(3));
        
        System.out.println(name.concat(" Pandit"));

        String s1 = "Navin";
        String s2 = "Navin";
        System.out.println(s1 == s2);

    }
}