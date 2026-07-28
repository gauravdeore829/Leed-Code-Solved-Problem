class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    int n1 = nums1.length;
    int n2 = nums2.length;
   
    


    int i = m - 1; 
        int j = n - 1; 
        int k = m + n - 1; 
        
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    
    // for (int d = 0; d < n1; d++) {
    //   System.out.print(nums1[d] + " ");
    // }
    }
}
