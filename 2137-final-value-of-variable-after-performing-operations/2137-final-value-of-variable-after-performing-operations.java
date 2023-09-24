class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int ans = 0;
        for(String s: operations){
            ans = helper(s, ans);
            System.out.println(ans);
        }

        return ans;
    }

    public int helper(String s, int ans){
        if(s.equals("++X") || s.equals("X++")){
            ans += 1;
        }
        else{
            ans -= 1;
        }
        return ans;
    }
}