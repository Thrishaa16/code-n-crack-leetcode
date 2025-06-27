import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n3 = n1 + n2;

        int[] n = new int[n3];
        System.arraycopy(nums1, 0, n, 0, n1);
        System.arraycopy(nums2, 0, n, n1, n2);
        
        Arrays.sort(n);

        if (n3 % 2 == 1) {
            return n[n3 / 2];
        } else {
            return (n[n3 / 2 - 1] + n[n3 / 2]) / 2.0;
        }
    }
}
