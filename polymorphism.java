class Computer{
    public void show(){
        System.out.println("In Computer");
    }
}
class Laptop extends Computer{
    public void show(){
        System.out.println("In Laptop");
    }
}

class A{
    public void show(){
        System.out.println("In A");
    }
}

class B extends A{
    public void show(){
        System.out.println("In B");
    }
}

class C extends A{
    public void show(){
        System.out.println("In C");
    }
}
class polymorphism{
    public static void main(String args[]){
        Computer obj = new Laptop();    //reference of parent class(Computer) & object of child class(Laptop)
        obj.show();

        A obj1 = new A();
        obj1.show();

        obj1 = new B();
        obj1.show();

        obj1 = new C();
        obj1.show();
    }
}