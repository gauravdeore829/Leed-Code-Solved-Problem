class Solution {
    public int romanToInt(String s) {

        int n = s.length();
        String[] arr = new String[n];

        
        for (int i = 0; i < n; i++) {
            arr[i] = String.valueOf(s.charAt(i));
        }

        int count = 0;

        for (int j = 0; j < n; j++) {

            int curr = 0;

            if (arr[j].equals("I")) curr = 1;
            else if (arr[j].equals("V")) curr = 5;
            else if (arr[j].equals("X")) curr = 10;
            else if (arr[j].equals("L")) curr = 50;
            else if (arr[j].equals("C")) curr = 100;
            else if (arr[j].equals("D")) curr = 500;
            else if (arr[j].equals("M")) curr = 1000;

            if (j < n - 1) {

                int next = 0;

                if (arr[j + 1].equals("I")) next = 1;
                else if (arr[j + 1].equals("V")) next = 5;
                else if (arr[j + 1].equals("X")) next = 10;
                else if (arr[j + 1].equals("L")) next = 50;
                else if (arr[j + 1].equals("C")) next = 100;
                else if (arr[j + 1].equals("D")) next = 500;
                else if (arr[j + 1].equals("M")) next = 1000;

                if (curr < next)
                    count -= curr;
                else
                    count += curr;

            } else {
                count += curr;
            }
        }

        return count;
    }
}