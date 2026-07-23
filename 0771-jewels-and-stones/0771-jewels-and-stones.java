class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> sc=new HashSet<>();
        int count=0;
        char[] j=jewels.toCharArray();
        for(char x:j){
          sc.add(x);
        }
        char[] s=stones.toCharArray();
        for(char x:s){
            if(sc.contains(x)){
                count++;
            }
        }
        return count;
    }
}