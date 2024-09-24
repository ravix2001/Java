import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UsingFinally {
    public static void main(String args[]) throws NumberFormatException, IOException{
        int num = 0;
        BufferedReader br = null;
        try{
            InputStreamReader in = new InputStreamReader(System.in);
            br = new BufferedReader(in);

            num = Integer.parseInt(br.readLine());

            System.out.println(num);
        }
        finally{
            br.close();
        }
    }
}
//it can be optimized using auto closing the resource in next program - OptimizedBufferReader.java