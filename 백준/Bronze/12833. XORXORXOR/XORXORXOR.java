import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] input = br.readLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int C = Integer.parseInt(input[2]);
        
        int result = 0;
        for (int i = 0; i < C; i++) {
            result = A ^ B;
            A = result;
        }
        
        bw.write(Integer.toString(result));
        bw.newLine();
        
        br.close();
        bw.close();
    }
}