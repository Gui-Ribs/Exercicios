import java.io.*;
import java.util.Locale;

public class triangulo {
    public static void main(String[] args) throws IOException {
        System.out.println("Digite os valores:");
        StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        StringBuilder sb = new StringBuilder();
        final double PI = 3.14;
        while (in.nextToken() != StreamTokenizer.TT_EOF) {
            double a = in.nval;
            in.nextToken(); double b = in.nval;
            in.nextToken(); double t = in.nval;
            if (a == 0 && b == 0 && t == 0) break;
            sb.append(String.format(Locale.US, "%.4f\n", 0.5 * a * b * Math.sin(t * PI / 180.0)));
        }
        System.out.print(sb);
    }
}
