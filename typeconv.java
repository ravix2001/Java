class typeconv{
    public static void main(String args[]){

        byte d = 122;
        int num = d;    //implicit conversion

        int a = 44;
        byte b = (byte)a;   //explicit conversion   or type casting

        int i = 258;    //Modulo division num % 256 => 258 % 256 => Rem = 2
        byte j = (byte)i;

        float f = 5.6f;
        int x = (int)f;

        byte p = 30;
        byte q = 10;
        int result = p*q;   //type promotion

        System.out.println(num);
        System.out.println(a);
        System.out.println(b);
        System.out.println(j);
        System.out.println(x);
        System.out.println(result);
        
    }
}