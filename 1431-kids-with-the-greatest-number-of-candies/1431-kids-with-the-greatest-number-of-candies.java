class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extra) {
        int max=0;
        for(int x:candies){
             max=Math.max(max,x);
        }
        List<Boolean> list=new ArrayList<>();
        for(int c:candies){
            if(c+extra>=max){
                list.add(true);
            }else{
                list.add(false);
            }
        }
        return list;
    }
}