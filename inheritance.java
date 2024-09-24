class Calc{
    public int add(int n1 , int n2){
        return n1+n2;
    }
    public int sub(int n1 , int n2){
        return n1-n2;
    }
}

class AdvCalc extends Calc{             //inheritance
    public int mul(int n1 , int n2){
        return n1*n2;
    }
    public double div(int n1 , int n2){
        return n1/n2;
    }
}

class SciFicCalc extends AdvCalc{           //multi-level inheritance
    public double power(int n1 , int n2){
        return Math.pow(n1,n2);
    }
}

class inheritance{
    public static void main(String args[]){
        SciFicCalc obj = new SciFicCalc();
        int r1 = obj.add(4,7);
        int r2 = obj.sub(9,4);
        int r3 = obj.mul(3,4);
        double r4 = obj.div(9,4);
        double r5 = obj.power(4,2);
        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);
    }
}