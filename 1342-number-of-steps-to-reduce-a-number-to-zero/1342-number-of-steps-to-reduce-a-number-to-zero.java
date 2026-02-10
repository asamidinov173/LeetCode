class Solution {
    public int numberOfSteps(int num) {
        int steps = 0;

        while (num > 0) {
            if ((num & 1) == 0) { 
                num >>= 1;
            } else {
                // remainder is 1
                num--;
            }

            steps++;
        }

        return steps;
    }

    // Time Complexity = 0(logn)
    // Space Complexity = 0(1)
}