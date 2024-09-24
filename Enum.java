enum Status{
    Running, Failed, Pending, Success;
}

class Enum{
    public static void main(String args[]){
        Status s = Status.Pending;
        System.out.println(s);

        if(s == Status.Running){
            System.out.println("All Good");
        }
        else if(s == Status.Failed){
            System.out.println("Try Again!");
        }
        else if(s == Status.Pending){
            System.out.println("Please Wait...");
        }
        else{
            System.out.println("Done");
        }
        //we can also use switch case
    }
}