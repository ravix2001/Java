class Adder{
    public int add(int n1 , int n2){
        return n1 + n2 ;
    }
    public int add(int n1 , int n2 , int n3){
        return n1 + n2 + n3 ;
    }
    public double add(double n1 , double n2){
        return n1 + n2;
    }
}
public class methodOverloading{
    public static void main(String args[]){
        Adder obj1 = new Adder();
        Adder obj2 = new Adder();
        int sum = obj1.add(4,5,7);
        double result = obj2.add(4,5.5);
        System.out.println(sum);
        System.out.println(result);
    }
}