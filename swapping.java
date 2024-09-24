class Swap{
    int a;
    int b;
    int c;

    public void swap(){
        c = a;
        a = b;
        b = c;
    }
    public void beforeSwapping(){
        System.out.println("Before swapping :  " + "a = "+ a + "  &  b = " + b);
    }

    public void afterSwapping(){
        System.out.println("After swapping :  " + "a = "+ a + "  &  b = " + b);
    }
}
class swapping{
    public static void main(String args[]){
        Swap obj = new Swap();
        obj.a = 5;
        obj.b = 2;
        obj.beforeSwapping();
        obj.swap();
        obj.afterSwapping();

    }
}