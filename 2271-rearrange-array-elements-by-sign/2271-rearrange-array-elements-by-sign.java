class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer>list1 = new ArrayList<>();
        ArrayList<Integer>list2 = new ArrayList<>();

        int arr[] = new int[nums.length];

        for(int data: nums){
            if(data < 0){
                list2.add(data);
            }else{
                list1.add(data);
            }
        }

        int j = 0;
        for(int i = 0; i < nums.length; i+=2){
            arr[i] = list1.get(j);
            arr[i + 1] = list2.get(j);

            j += 1;
        }


        return arr;
    }
}