import java.util.*;
import java.lang.*;
import java.io.*;

class CoronaSpread{

    public static void solve(int testId, Scanner sc) {
        int n = sc.nextInt();
        ArrayList < Integer > v = new ArrayList < > ();

        for (int i = 1; i <= n; ++i) {
            int x = sc.nextInt();
            v.add(x);
        }

        int mn = n;
        int mx = 0;
        int l = 0;

        for (int i = 0; i < v.size(); ++i) {
            if (i > 0 && v.get(i) - v.get(i - 1) > 2) l = i;
            if (i + 1 == v.size() || v.get(i + 1) - v.get(i) > 2) {
                int cur = i - l + 1;
                if (cur < mn) mn = cur;
                if (cur > mx) mx = cur;
            }
        }

        System.out.println(mn + " " + mx);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        for (int i = 1; i <= tests; ++i) {
            solve(i, sc);
        }

        sc.close();
    }
}