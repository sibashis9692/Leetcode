class Solution {
    public int search(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;

        while(i <= j){
            if(nums[i] == target){
                return i;
            }else if(nums[j] == target){
                return j;
            }

            int mid = i + (j - i) / 2;
            
            if(nums[mid] == target){
                return mid;
            }

            if(nums[mid] > target){
                j = mid - 1;
            }

            if(nums[mid] < target){
                i = mid + 1;
            }
        }

        return -1;
    }
}