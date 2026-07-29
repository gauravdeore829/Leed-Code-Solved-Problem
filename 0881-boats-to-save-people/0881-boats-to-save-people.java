class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left = 0;
        int n = people.length;
        int right = n - 1;
        int count = 0;

        while (left < right) {
            if (people[right] == limit) {
                count++;
                right--;
            } else if (people[right] + people[left] > limit) {
                count++;
                right--;
            } else {
                count++;
                left++;
                right--;
            }
        }

        
        if (left == right) {
            count++;
        }

        return count;
    }
}