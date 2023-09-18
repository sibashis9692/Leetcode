class Solution {
    public int missingNumber(int[] nums) {
        int A = 0;
        int B = 0;

        for(int i = 0; i <= nums.length; i++){
            A += i;
            if(i != nums.length){
                B += nums[i];
            }
        }

        return A - B;
    }
}