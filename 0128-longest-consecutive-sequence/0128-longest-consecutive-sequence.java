class Solution {
    public int longestConsecutive(int[] nums) {
        // if(nums.length < 2){
        //     return nums.length;
        // }

        HashSet<Integer> list= new HashSet<>();

        for(int data: nums){
            list.add(data);
        }

        int max_length = 0;

        for(int i = 0; i < nums.length; i++){
            int data = nums[i];
            int current_length = 1;

            if(!list.contains(data - 1)){
                if(list.contains(data + 1)){
                    while(list.contains(data + 1)){
                        current_length += 1;
                        data += 1;
                    }
                }
            }

            max_length = max_length < current_length ? current_length : max_length;
        }

        return max_length;
    }
}