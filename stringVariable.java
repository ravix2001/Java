class Mobile{
    String brand;
    int price;
    static String name;

    static{                                     //static block (called 1 time)
        name = "Phone";
        System.out.println("In static block: ");
    }

    public Mobile(){        //constructor (called 2 times)
        brand = "";
        price = 200;
        System.out.println("In constructor: ");
    }

    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void show1(Mobile obj){
        System.out.println("In static method: ");
        System.out.println(obj.brand + " : " + obj.price + " : " + name);       //cannot take brand & price directly, we have to clear which object 
    }
}
class stringVariable{
    public static void main(String args[]){

        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        //Mobile.name = "Smart Phone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;

        obj1.show();
        obj2.show();

        Mobile.show1(obj1);     //Non static method

    }
}