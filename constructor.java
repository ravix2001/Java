class Animal{
    private String name;
    private int popn;

    public  Animal(){           //default constructor
        name = "Lion";
        popn = 18;
    }

    public Animal(String name , int popn){      //parameterized constuctor
        this.name = name;
        this.popn = popn;
    }

    public void setName(String name){      //setter
        this.name = name;
    }
    public void setPopn(int popn){          //setter
        this.popn = popn;
    }

    public String getName(){            //getter
        return name;
    }
    
    public int getPopn(){                //getter
        return popn;
    }
}
class constructor{
    public static void main(String args[]){
        Animal obj = new Animal("Tiger" , 22);

        // obj.setName("Tiger");
        // obj.setPopn(22);

        System.out.println(obj.getName() + " : " + obj.getPopn());

    }
}