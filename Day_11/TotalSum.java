import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class TotalSum {
    private static final int MOD = 1000000007;

    private static long power(long base, long exp) {
        long res = 1;
        base %= MOD;
        while (exp > 0) {
            if ((exp & 1) == 1) res = (res * base) % MOD;
            base = (base * base) % MOD;
            exp >>= 1;
        }
        return res;
    }

    private static long modInverse(long n) {
        return power(n, MOD - 2);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null || line.trim().isEmpty()) return;

        StringTokenizer st = new StringTokenizer(line);
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        if (K == 0) {
            System.out.println(1);
            return;
        }

        long[] fact = new long[N + 1];
        fact[0] = 1;
        for (int i = 1; i <= N; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
        }

        long[] invFact = new long[N + 1];
        invFact[N] = modInverse(fact[N]);
        for (int i = N - 1; i >= 0; i--) {
            invFact[i] = (invFact[i + 1] * (i + 1)) % MOD;
        }

        long totalSum = 0;
        for (int i = 0; i <= K; i += 2) {
            long nCr = fact[N];
            nCr = (nCr * invFact[i]) % MOD;
            nCr = (nCr * invFact[N - i]) % MOD;

            totalSum = (totalSum + nCr) % MOD;
        }

        System.out.println(totalSum);
    }
}
