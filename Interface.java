interface A{
    void show();
    void config();
}

class B implements A{
    public void show(){
        System.out.println("in show");
    }
    public void config(){
        System.out.println("in config");
    }
}

class Interface{
    public static void main(String args[]){
        A obj = new B();
        obj.show();
        obj.config();
    }
}