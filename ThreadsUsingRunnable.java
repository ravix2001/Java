//Threads Using Runnable Interface

class A implements Runnable{
    public void run(){
        for(int i=0; i<40; i++){
            System.out.println("Hi");
        }
    }
}
class B implements Runnable{
    public void run(){
        for(int i=0; i<40; i++){
            System.out.println("Hello");
        }
    }
}

public class ThreadsUsingRunnable {
    public static void main(String args[]){
        Runnable obj1 = new A();
        Runnable obj2 = new B();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
