class Solution {
    public int[] sortArray(int[] nums) {
        int high = nums.length - 1;
        Merge_sort(nums, 0, high);

        return nums;
    }

    public static void Merge_sort(int nums[], int low, int high){
        if(low < high){
            int mid = (high + low) / 2;
            Merge_sort(nums, low, mid);
            Merge_sort(nums, mid+1, high);
            helper(nums, low, mid, high);
        }
    }
    public static void helper(int nums[], int low , int mid, int high){
        int l = low;
        int m = mid + 1;
        int k = low;

        int arr[] = new int[(int)(Math.pow(10, 4) * 5) + 1];

        while(l <= mid && m <= high){
            if(nums[l] < nums[m]){
                arr[k] = nums[l];
                l+=1;
                k+=1;
            }else{
                arr[k] = nums[m];
                m+=1;
                k+=1;
            }
        }

        while(l <= mid){
            arr[k] = nums[l];
            l+=1;
            k+=1;
        }

        while(m <= high){
            arr[k] = nums[m];
            m+=1;
            k+=1;
        }

        for(int i = low; i <= high; i++){
            nums[i] = arr[i];
        }
    }
}