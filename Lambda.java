interface A{
    void show(int n);
}

class Lambda{
    public static void main(String args[]){
        /*A obj = (n) ->               //lambda expression
        {
            System.out.println("in show" + " " + n);
        }
        ;*/
        
        //for single line declaration we can revome bracket as well and the lambda expression becomes
        
        A obj = n -> System.out.println("in show" + " " + n);
        
        obj.show(8);
    }
}