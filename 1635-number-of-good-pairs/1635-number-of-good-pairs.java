class Solution {
    public int numIdenticalPairs(int[] nums) {
        int num = 0;
        for(int i = 0; i <= nums.length - 1; i++){
            for(int j = i + 1; j <= nums.length - 1; j++){
                if(nums[i] == nums[j]){
                    num += 1;
                }
            }
        }
        return num;
    }
}