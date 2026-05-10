import java.io.*;

public class base {
    public static void main(String[] args) throws IOException {
        System.out.println("Digite os valores:");
        StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        in.nextToken(); int ds = (int) in.nval;
        in.nextToken(); int ys = (int) in.nval;
        in.nextToken(); int dm = (int) in.nval;
        in.nextToken(); int ym = (int) in.nval;
        for (int t = 1; t <= 5000; t++) {
            if ((t + ds) % ys == 0 && (t + dm) % ym == 0) {
                System.out.println(t);
                return;
            }
        }
    }
}
