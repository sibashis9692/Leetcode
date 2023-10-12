class Solution {
    public boolean check(int[] nums) {
        if(nums.length == 1){
            return true;
        }

        int count = 0;
        // int i = 1;

        // while(i < nums.length && nums[i - 1] < nums[i]){
        //     i += 1;
        // }

        // if(i < nums.length){
        //     count += 1;
        // }

        // i += 1;

        // while(i < nums.length){
        //     if(nums[i - 1] > nums[i]){
        //         return false;
        //     }
        //     i += 1;
        // }
        
        for(int i = 1; i < nums.length; i++){
            if(nums[i] < nums[i - 1]){
                count += 1;
            }
        }

        if(nums[nums.length - 1] > nums[0]){
            count += 1;
        }

        return count < 2;
    }
}