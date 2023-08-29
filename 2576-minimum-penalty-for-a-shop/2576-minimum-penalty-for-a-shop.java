class Solution {
    public int bestClosingTime(String customers) {
        int length=customers.length();
        int count=0;
        int min=Integer.MAX_VALUE;
        int ans=0;
        for(int i=0;i<length;i++){
            if(customers.charAt(i) == 'Y'){
                count+=1;
            }
        }
        for(int i=-1;i<length;i++){
            if(i == -1){
                min=count;
            }
            else if(customers.charAt(i) == 'Y'){
                count-=1;
            }
            else if(customers.charAt(i) == 'N'){
                count+=1;
            }
            if(min > count){
                min=count;
                ans=i+1;
            }
        }
        return ans;
    }
}