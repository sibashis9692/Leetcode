class Solution {
    public int[] sortArray(int[] nums) {
        int high = nums.length - 1;
        Merge_sort(nums, 0, high);

        return nums;
    }

    public static void Merge_sort(int nums[], int low, int high){
        if(low < high){
            int mid = low + (high - low) / 2;
            Merge_sort(nums, low, mid);
            Merge_sort(nums, mid+1, high);
            merge(nums, low, mid, high);
        }
    }
    public static int[] merge(int nums[], int si, int mid, int ei) {
        int i = si;
        int j = mid+1;
        int temp[] = new int[ei-si+1];
        int k = 0;

        while(i<=mid && j<=ei) {
            if(nums[i]<nums[j]) {
                temp[k++] = nums[i++];
            }
            else {
                temp[k++] = nums[j++];
            }
        }

        while(i<=mid) {
            temp[k++] = nums[i++];
        }

        while(j<=ei) {
            temp[k++] = nums[j++];
        }

        for(int x=0, y=si; x<temp.length; x++,y++) {
            nums[y] = temp[x];
        }
        return nums;
    }

}