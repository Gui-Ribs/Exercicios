import java.io.*;

public class suprimentos {
    public static void main(String[] args) throws IOException {
        System.out.println("Digite n e os t eventos:");
        StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        in.nextToken();
        int n = (int) in.nval;
        long sum = 0, min = 0;
        for (int i = 0; i < n; i++) {
            in.nextToken();
            sum += (long) in.nval;
            if (sum < min) min = sum;
        }
        System.out.println(-min);
    }
}
