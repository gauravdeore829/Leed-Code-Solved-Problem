class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {

        int n = customers.length;
        int already = 0;
        int curExtra = 0;
        int maxExtra = 0;

        // Customers already satisfied
        for (int i = 0; i < n; i++) {
            if (grumpy[i] == 0) {
                already += customers[i];
            }
        }

        // First window
        for (int i = 0; i < minutes; i++) {
            if (grumpy[i] == 1) {
                curExtra += customers[i];
            }
        }

        maxExtra = curExtra;

        // Sliding window
        for (int i = minutes; i < n; i++) {

            if (grumpy[i] == 1) {
                curExtra += customers[i];
            }

            if (grumpy[i - minutes] == 1) {
                curExtra -= customers[i - minutes];
            }

            maxExtra = Math.max(maxExtra, curExtra);
        }

        return already + maxExtra;
    }
}