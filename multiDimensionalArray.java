public class multiDimensionalArray{
    public static void main(String args[]){
        int num[][] = new int[3][4];        //2D-Array

        for(int i=0 ; i<3 ; i++){
            for(int j=0 ; j<4 ; j++){
                num[i][j] = (int)(Math.random() * 10);
                //System.out.println(num[i][j]);
            }
        }

        for(int i=0 ; i<3 ; i++){
            for(int j=0 ; j<4 ; j++){
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }

        //enhanced for loop - we don't need to mention the size of an array
        
        for(int n[] : num){
            for(int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}