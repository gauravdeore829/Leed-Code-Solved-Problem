class Solution {
    public int mySqrt(int x) {
      int left=0;
      int right=x;
      int root=x;
      while(left<=right){
        long mid=left+(right-left)/2;
        if(mid*mid==x){
            return (int)mid;
        }
        else if(mid*mid<x){
            root=(int)mid;
            left=(int)mid+1;
        }
        else{
            right=(int)mid-1;
        }
      }
      return root;
    }
}