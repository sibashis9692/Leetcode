class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 1;

        while(0 < i && nums[i] <= nums[i - 1]){
            i -= 1;
        }

        if(i <= 0){
            Arrays.sort(nums);
        }

        else{
            int small = nums[i];
            int index = i - 1;

            for(int j = i; j < nums.length; j++){
                if(small >= nums[j] && nums[j] > nums[i - 1]){
                    small = nums[j];
                    index = j;
                }
            }

            int data = nums[i - 1];
            nums[i - 1] = nums[index];
            nums[index] = data;

            Arrays.sort(nums, i, nums.length);
        }
    }
}