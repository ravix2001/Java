class A{
    public void show(){
        System.out.println("in A");
    }
}

class B extends A{
    public void show(){
        System.out.println("in B");
    }
}

class methodOverriding{
    public static void main(String args[]){
        B obj = new B();
        obj.show();
    }
}