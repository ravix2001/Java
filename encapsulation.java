class Human{
    private String name;
    private int age;

    public Human(){             //constructor => if no data is given, the default values will be taken from constructor
        name = "John";
        age = 18;
    }

    /*
    public void setName(String n){      //setter
        name = n;
    }
    */
   //instead of using two different variables we can use the same variable as local and instance varaible by using "this" keyword

    public void setName(String name){      //setter
        this.name = name;
    }
    
    /*
    public void setAge(int a){          //setter
        age = a;
    }
    */

    public void setAge(int age){          //setter
        this.age = age;
    }

    public String getName(){            //getter
        return name;
    }
    
    public int getAge(){                //getter
        return age;
    }
}

class encapsulation{
    public static void main(String args[]){
        Human obj = new Human();

        obj.setName("Ravi");
        obj.setAge(22);

        System.out.println(obj.getName() + " : " + obj.getAge());

    }
}