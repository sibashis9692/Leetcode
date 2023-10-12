class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max_Ones = 0;
        int temp_max = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                temp_max = 0;
            }
            if(nums[i] == 1){
                temp_max += 1;
            }

            max_Ones = max_Ones < temp_max ? temp_max : max_Ones;
        }

        return max_Ones;
    }
}