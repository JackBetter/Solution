import com.alibaba.fastjson.JSON;

public class Solution0088 {


    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = 0, p2 = 0;
        int[] sortNums = new int[m + n];
        int cur;

        while (p1 < m || p2 < n) {
            if (p1 == m) {
                cur = nums2[p2++];
            } else if (p2 == n) {
                cur = nums1[p1++];
            } else if (nums1[p1] < nums2[p2]) {
                cur = nums1[p1++];
            } else {
                cur = nums2[p2++];
            }
            sortNums[p1 + p2 - 1] = cur;
        }

        return sortNums;
    }


    public static void main(String[] args) {
        int[] nums1 ={1, 2, 3};
        int m = 3;
        int[] nums2 ={2, 5, 6};
        int n = 3;
        int[] merge = merge(nums1, m, nums2, n);

        System.out.println(JSON.toJSONString(merge));
    }


}
