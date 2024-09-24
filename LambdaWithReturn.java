interface A{
    int add(int a , int b);
}

class LambdaWithReturn{
    public static void main(String args[]){
        /*A obj = (a,b) ->               //lambda expression
        {
            return a+b;
        }
        ;*/
        
        //for single line declaration we can revome bracket as well and the lambda expression becomes
        
        A obj = (a,b) -> a+b;
        
        int result = obj.add(8,4);
        
        System.out.println(result);
        
    }
}