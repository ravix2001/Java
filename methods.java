class Computer{

    public void playMusic(){
        System.out.println("Playing Music...");
    }
    
    public String getMePen(int cost){
        if(cost>=10)
            return "Pen";

        return "Nothing";
    }
}
public class methods{
    public static void main(String args[])
    {
        Computer obj = new Computer();   //creating reference variable in java (object in C++)
        obj.playMusic();
        String str = obj.getMePen(20);
        System.out.println(str);
    }
}