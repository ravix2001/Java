class ExceptionHandling{
    public static void main(String args[]){

        //int i = 3;
        int i = 0;
        int j = 0;

        try{
            j = 9/i;
        }
        catch(Exception e){
            System.out.println("Something went wrong..." + e);
        }

        System.out.println(j);

        System.out.println("Bye!");
    }
}