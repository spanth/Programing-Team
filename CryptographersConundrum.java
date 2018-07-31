import java.util.*;
import java.math.*;
import java.io.*;

public class CryptographersConundrum {

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        
        String word = sc.next().toUpperCase();
        String PER = "PER";
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != PER.charAt(i%3)) {
                count++;
            }
        }
        System.out.println(count);
    }
    
    public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(Reader in) {
            br = new BufferedReader(in);
        }

        public FastScanner() { this(new InputStreamReader(System.in)); }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }

        // Slightly different from java.util.Scanner.nextLine(),
        // which returns any remaining characters in current line,
        // if any.  
        String readNextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
