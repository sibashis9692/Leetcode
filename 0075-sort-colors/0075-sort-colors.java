class Solution {
    public void sortColors(int[] nums) {
        int l = 0;
        int m = 0;
        int h = nums.length - 1;

        while(m <= h){
            if(nums[m] == 0){
                swaping(nums, l, m);
                l+=1;
                m+=1;
            }
            else if(nums[m] == 1){
                m += 1;
            }
            else{
                swaping(nums, m, h);
                h -= 1;
            }
        }
    }

    public static void swaping(int nums[], int i, int j){
        int data = nums[i];
        nums[i] = nums[j];
        nums[j] = data;
    }
}