import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> sc = new HashSet<>();
        ArrayList<Integer> bb = new ArrayList<>();

        for (int x : nums1) {
            sc.add(x);
        }

        for (int x : nums2) {
            if (sc.contains(x)) {
                bb.add(x);
                sc.remove(x);   
            }
        }

        int[] ans = new int[bb.size()];

        for (int i = 0; i < bb.size(); i++) {
            ans[i] = bb.get(i);
        }

        return ans;
    }
}