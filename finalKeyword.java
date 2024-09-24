class A{
    public void add(int a , int b){
        System.out.println(a+b);
    }
    public final void show(){
        System.out.println("By Ravi");
    }
}
final class B extends A{
    public void show(){                 //final method cannot be overridden
        System.out.println("By John");
    }
}

//class C extends class B{}        //class cannot be extended from final class

class finalKeyword{
    public static void main(String args[]){
        final int num = 5;
        //num = 6;          //variable cannot be extended from final variable(constant)

        B obj = new B();
        obj.add(4,5);
        //obj.show();
    }
}