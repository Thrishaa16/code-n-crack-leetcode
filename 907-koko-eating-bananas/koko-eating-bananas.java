class Solution {
    static int max(int a[]) {
        int m = a[0];
        for (int i = 1; i < a.length; i++) {
            if (m < a[i]) {
                m = a[i];
            }
        }
        return m;
    }

    static int minsp(int b[], int s) {
        int tt = 0;
        for (int i = 0; i < b.length; i++) {
            tt += b[i] / s;
            if (b[i] % s > 0) {
                tt++;
            }
        }
        return tt;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int s = 1, e = max(piles);  
        while (s < e) {
            int m = s + (e - s) / 2;
            if (minsp(piles, m) > h) {  
                s = m + 1;
            } else {
                e = m;
            }
        }
        return s;
    }
}
