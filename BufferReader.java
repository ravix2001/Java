import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReader{
    public static void main(String args[]) throws IOException{
        System.out.println("Enter a number : ");

        InputStreamReader in  = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        
        int num = Integer.parseInt(bf.readLine());
        System.out.println(num);
        
        bf.close();
    }
}

//Buffer Reader can take input from anywhere, not only from keyboard, it can also take input from the file, network, etc
//Buffer Reader is actually a resource so it is good to close it after use