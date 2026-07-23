class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> sc=new HashSet<>();
        boolean s=true;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(sc.contains(nums[i]))
             
          return true;
          else sc.add(nums[i]);
        }
        return false;
       
    }
}