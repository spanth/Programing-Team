import java.util.*;
import java.math.*;
import java.io.*;

public class AlterBoard {

    public static void main(String[] args) throws IOException {
        String fileName = "alter";
        File in = new File(fileName + ".in");

         Scanner sc = new Scanner(in);
         Scanner input = new Scanner(in);
         PrintWriter out = new PrintWriter(fileName + ".out");

        int n = sc.nextInt();
        int m = sc.nextInt();

        out.println((n / 2) + (m / 2));
        for (int i = n%2 == 0 ? 0 : 1; i < n; i+=2) {
            out.println((i+1) + " 1 "  + (i+1) + " " + m );
        }
        for (int i = m%2 == 0 ? 0 : 1; i < m; i+=2) {
            out.println("1 " + (i+1) + " " + n + " " + (i+1));
        }
        out.close();
    }
}
