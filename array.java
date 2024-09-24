public class array{
    public static void main(String args[]){
        int num[] = {5,6,7,8};
        System.out.println(num[1]);

        int nums[] = new int[4];
        nums[0] = 2 ;
        nums[1] = 5 ;
        nums[2] = 7 ;
        nums[3] = 88 ;
        for(int i=0;i<4;i++){
            System.out.println(nums[i]);
        }

        //for each loop
        
        for(int n : num){
            System.out.println(n);
        }
    }
}