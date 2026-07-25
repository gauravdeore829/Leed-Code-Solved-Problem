class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> sc=new HashSet<>();
        boolean s=true;
        int n=nums.length;
        for(int x:nums){
            if(sc.contains(x))
             
          return true;
          else sc.add(x);
        }
        return false;
       
    }
}