interface A{
    void show();
    void config();
}
interface X{
    void run();
}
interface Y extends A{

}
class B implements A,X{                 //A,X or A,Y multiple interface
    public void show(){
        System.out.println("in show");
    }
    public void config(){
        System.out.println("in config");
    }
    public void run(){
        System.out.println("in run");
    }
}

class inheritanceInInterface{
    public static void main(String args[]){
        A obj;
        obj = new B();
        obj.show();
        obj.config();
        X obj1 = new B();
        obj1.run();
    }
}