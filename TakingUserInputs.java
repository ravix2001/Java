import java.io.IOException;
import java.util.Scanner;

public class TakingUserInputs {
    public static void main(String args[]) throws IOException{

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String name = sc.nextLine();    //next() can only take 1 word but nextLine() can take a line until enter is pressed

        System.out.println("Enter your age : ");
        int age = sc.nextInt();

        System.out.println(name + " " + age);

        sc.close();
    }
    
}
