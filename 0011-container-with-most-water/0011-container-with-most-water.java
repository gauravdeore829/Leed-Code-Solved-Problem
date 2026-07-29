class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int n=height.length;
        int max=0;
        int right=n-1;
        while(left<right){
            int diff=right-left;
            int min=Math.min(height[left],height[right]);
            int a=diff*min;
              max=Math.max(max,a);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max;
    }
}