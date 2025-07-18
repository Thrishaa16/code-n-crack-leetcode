class Solution {
    public int[] countBits(int n) {
        int[] count = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            count[i] = countSetBits(i);
        }
        return count;
    }

    static int countSetBits(int n) {
        int cnt = 0;
        while (n > 0) {
            cnt += n % 2;
            n /= 2;
        }
        return cnt;
    }
}
