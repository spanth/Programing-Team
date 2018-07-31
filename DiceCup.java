import java.util.*;
import java.math.*;
import java.io.*;

public class DiceCup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] freq = new long[41];
        long max = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                freq[i+j]++;
                max = Math.max(max, freq[i+j]);
            }
        }
        
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == max) {
                System.out.println(i);
            }
        }
    }
}
