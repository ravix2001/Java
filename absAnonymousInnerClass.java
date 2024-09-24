abstract class A{
    public abstract void show();
    public abstract void config();
}

class absAnonymousInnerClass{
    public static void main(String args[]){
        A obj = new A()
        {
            public void show(){
                System.out.println("In new show");
            }
            public void config(){
                System.out.println("In config");
            }
        };

        obj.show();
        obj.config();
    }
}