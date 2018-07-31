import java.util.*;
import java.math.*;
import java.io.*;

public class PalindromicNaming {
    static long MOD = 1_000_000_007;
    static long[][][] cache;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int a = 0; a < n; a++) {
            String in = input.next();
            cache = new long[2][in.length()][in.length()];
            for (int q3 = 0; q3 < 2; q3++) {
                for (int q = 0; q < in.length(); q++) {
                    for (int q2 = 0; q2 < in.length(); q2++) {
                        cache[q3][q][q2] = -1;
                    }
                }
            }
            System.out.println(solve(in, 0, in.length() - 1, true));
        }

    }

    private static long solve(String in, int i, int j, boolean direction) {
        if (i == j) {
            return 1;
        }
        if (j < i) {
            return 0;
        }
        if (cache[direction ? 1 : 0][i][j] != -1) {
            return cache[direction ? 1 : 0][i][j];
        }
        long total = 0;
        if (in.charAt(i) == in.charAt(j)) {
            total += 1 + solve(in, i + 1, j - 1, true);
        }

        if (direction) {
            total += solve(in, i + 1, j, true);
        }
        total += solve(in, i, j - 1, false);
        total = total % MOD;
        cache[direction ? 1 : 0][i][j] = total;
        return total;
    }
}
