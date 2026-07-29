class Solution {

    public int trap(int[] height) {

        int n = height.length;
        int water = 0;

        int left = 0;
        int right = n - 1;

        int leftMax = height[0];
        int rightMax = height[n - 1];

        while (left < right) {

            if (leftMax < rightMax) {

                left++;

                if (height[left] > leftMax)
                    leftMax = height[left];

                water += leftMax - height[left];

            } else {

                right--;

                if (height[right] > rightMax)
                    rightMax = height[right];

                water += rightMax - height[right];
            }
        }

        return water;
    }
}