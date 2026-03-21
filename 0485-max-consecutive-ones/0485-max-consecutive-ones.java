class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int length = 0;
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                length++;
                
                if(length > max) {
                    max = length;
                }
                
            }
            else length = 0;
        }
        return max;
    }
}