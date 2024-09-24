class TryWithMultipleCatch{
    public static void main(String args[]){

        int i = 3;
        //int i = 0;
        int j = 0;
        int nums[] = new int[5];

        try{
            j = 9/i;
            System.out.println(nums[5]);
        }
        catch(ArithmeticException e){                   //particular exception handling
            System.out.println("Cannot divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e){        //particular exception handling
            System.out.println("Array out of limits");
        }
        catch(Exception e){             //if we are not sure what exception may arise then we use this to handle it
            System.out.println("Something went wrong...");
        }

        System.out.println(j);

        System.out.println("Bye!");
    }
}